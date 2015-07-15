package com.jvms.i18neditor;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import com.jvms.i18neditor.util.MessageBundle;

/**
 * This class represents a menu item for removing a translation key.
 * 
 * @author Jacob
 */
public class RemoveTranslationMenuItem extends JMenuItem {
	private static final long serialVersionUID = 5207946396515235714L;
	
	public RemoveTranslationMenuItem(Editor editor, boolean enabled) {
        super(MessageBundle.get("menu.edit.delete.title"));
		setAccelerator(KeyStroke.getKeyStroke("DELETE"));
		addActionListener(e -> editor.removeSelectedTranslation());
		setEnabled(enabled);
	}
}