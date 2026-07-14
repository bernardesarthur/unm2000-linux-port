// Shim para o port Linux do UNM2000 — mesma técnica do SynthIcon (2026-06-10).
// O JIDE (BasicStyledLabelUI.paintStyledText) referencia esta classe, que só
// existe no JDK da Oracle/OpenJDK para Windows. No Linux a referência vira
// NoClassDefFoundError dentro do paint. Este stub nunca é instalado como LAF:
// só precisa ser carregável para o instanceof/class literal do JIDE resolver
// (e retornar false, caindo no caminho de pintura padrão).
package com.sun.java.swing.plaf.windows;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class WindowsLookAndFeel extends BasicLookAndFeel {

    @Override
    public String getName() {
        return "Windows";
    }

    @Override
    public String getID() {
        return "Windows";
    }

    @Override
    public String getDescription() {
        return "Stub do port Linux — nunca instalado como LookAndFeel ativo";
    }

    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }

    @Override
    public boolean isSupportedLookAndFeel() {
        return false;
    }
}
