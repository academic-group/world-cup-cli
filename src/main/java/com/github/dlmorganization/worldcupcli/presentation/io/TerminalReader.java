package com.github.dlmorganization.worldcupcli.presentation.io;

import org.jline.keymap.BindingReader;
import org.jline.keymap.KeyMap;
import org.jline.reader.EndOfFileException;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.Terminal;
import org.jline.utils.InfoCmp;

import java.io.IOError;

public class TerminalReader {
    private final Terminal terminal;
    private final BindingReader bindingReader;

    private final KeyMap<KeyboardKey> keyMap;

    public TerminalReader(Terminal terminal) {
        this.terminal = terminal;
        this.bindingReader = new BindingReader(terminal.reader());

        keyMap = new KeyMap<>();
        KeyboardKey[] keys = KeyboardKey.values();

        // Mapeia cada número para seu respectivo valor do enum KeyboardKey
        int i = KeyboardKey.N0.ordinal();
        for (int j = 0; j < 10; j++) {
            keyMap.bind(keys[i], Character.toString(j + '0'));
            i++;
        }

        // Mapeia cada letra para seu respectivo valor do enum KeyboardKey
        i = KeyboardKey.A.ordinal();
        for (int j = 0; j < 26; j++) {
            keyMap.bind(keys[i], Character.toString(j + 'A'), Character.toString(j + 'a'));
            i++;
        }

        // Mapeia outras teclas para seus respectivos valores do enum KeyboardKey
        keyMap.bind(KeyboardKey.SPACE, " ");
        keyMap.bind(KeyboardKey.ENTER, "\r");
        keyMap.bind(KeyboardKey.UP_ARROW, KeyMap.key(terminal, InfoCmp.Capability.key_up));
        keyMap.bind(KeyboardKey.DOWN_ARROW, KeyMap.key(terminal, InfoCmp.Capability.key_down));
    }

    public String readLine(String prompt)
            throws UserInterruptException, EndOfFileException, IOError
    {
        LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();
        return reader.readLine(prompt);
    }

    public KeyboardKey getKey() {
        return bindingReader.readBinding(keyMap);
    }
}
