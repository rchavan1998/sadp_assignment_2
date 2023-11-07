package com.microoffice;

class Word00Factory extends AbstractWordFactory {
	@Override
	public AbstractPanel makePanel() {
		return new Word00Panel();
	}

	@Override
	public AbstractButton makeButton() {
		return new Word00Button();
	}

	@Override
	public AbstractTextbox makeTextbox() {
		return new Word00Textbox();
	}
}