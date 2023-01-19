package com.lt.note.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Note {

	private LocalDateTime date;
	private String content;

	public Note() {

		super();

	}

	public Note(LocalDateTime date, String content) {

		this.date = date;
		this.content = content;

	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Note [date=" + date + ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(content, other.content) && Objects.equals(date, other.date);
	}

}
