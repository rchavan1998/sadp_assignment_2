package com.microoffice;

class Word10Factory extends AbstractWordFactory {
	@Override
	public AbstractPanel makePanel() {
		return new Word10Panel();
	}

	@Override
	public AbstractButton makeButton() {
		return new Word10Button();
	}

	@Override
	public AbstractTextbox makeTextbox() {
		return new Word10Textbox();
	}
}
