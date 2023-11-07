package com.microoffice;

class Word90Factory extends AbstractWordFactory {
	@Override
	public AbstractPanel makePanel() {
		return new Word90Panel();
	}

	@Override
	public AbstractButton makeButton() {
		return new Word90Button();
	}

	@Override
	public AbstractTextbox makeTextbox() {
		return new Word90Textbox();
	}
}