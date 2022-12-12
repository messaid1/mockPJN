package com.mock.mockPJN;

public class HttpNotFound {

    private final long id;
	private final String content;

	public HttpNotFound(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
    
}
