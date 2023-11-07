package com.microoffice;

class Word21Factory extends AbstractWordFactory {
	@Override
	public AbstractPanel makePanel() {
		return new Word21Panel();
	}

	@Override
	public AbstractButton makeButton() {
		return new Word21Button();
	}

	@Override
	public AbstractTextbox makeTextbox() {
		return new Word21Textbox();
	}
}
