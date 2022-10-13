package com.api.api;

public class ShowsDB {
    private final long id;
	private final String show_name;
    private final String quote;

	public ShowsDB(long id, String show_name, String quote) {
		this.id = id;
        this.show_name = show_name;
        this.quote = quote;
	}

    public long getId() {
        return id;
    }

    public String getShow_name() {
        return show_name;
    }

    public String getQuote() {
        return quote;
    }




}
