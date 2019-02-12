/**
 * 
 */
package com.csf.eventmng.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author tuandq
 *
 */
@Entity(name = "tbl_events_demo")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String start_date;
	private String start_time;
	private String end_date;
	private String end_time;
	private boolean is_daily;
	private boolean is_all_day;
	private String location;
	private boolean is_notification;
	private String time_notification;
	private Integer owner;
	private String event_conten;
	private String file_attack;
	private boolean guest_can_invite;
	private boolean view_all_guest;
	private String item_preparing;
	private boolean is_public;
	private boolean is_cancel;
	private boolean is_delete;
	private String time_create;
	private String last_edit;
	private Integer user_edit;
	private short status;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}

	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	/**
	 * @return the start_time
	 */
	public String getStart_time() {
		return start_time;
	}

	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	/**
	 * @return the end_date
	 */
	public String getEnd_date() {
		return end_date;
	}

	/**
	 * @param end_date the end_date to set
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	/**
	 * @return the end_time
	 */
	public String getEnd_time() {
		return end_time;
	}

	/**
	 * @param end_time the end_time to set
	 */
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	/**
	 * @return the is_daily
	 */
	public boolean isIs_daily() {
		return is_daily;
	}

	/**
	 * @param is_daily the is_daily to set
	 */
	public void setIs_daily(boolean is_daily) {
		this.is_daily = is_daily;
	}

	/**
	 * @return the is_all_day
	 */
	public boolean isIs_all_day() {
		return is_all_day;
	}

	/**
	 * @param is_all_day the is_all_day to set
	 */
	public void setIs_all_day(boolean is_all_day) {
		this.is_all_day = is_all_day;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the is_notification
	 */
	public boolean isIs_notification() {
		return is_notification;
	}

	/**
	 * @param is_notification the is_notification to set
	 */
	public void setIs_notification(boolean is_notification) {
		this.is_notification = is_notification;
	}

	/**
	 * @return the time_notification
	 */
	public String getTime_notification() {
		return time_notification;
	}

	/**
	 * @param time_notification the time_notification to set
	 */
	public void setTime_notification(String time_notification) {
		this.time_notification = time_notification;
	}

	/**
	 * @return the owner
	 */
	public Integer getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	/**
	 * @return the event_conten
	 */
	public String getEvent_conten() {
		return event_conten;
	}

	/**
	 * @param event_conten the event_conten to set
	 */
	public void setEvent_conten(String event_conten) {
		this.event_conten = event_conten;
	}

	/**
	 * @return the file_attack
	 */
	public String getFile_attack() {
		return file_attack;
	}

	/**
	 * @param file_attack the file_attack to set
	 */
	public void setFile_attack(String file_attack) {
		this.file_attack = file_attack;
	}

	/**
	 * @return the guest_can_invite
	 */
	public boolean isGuest_can_invite() {
		return guest_can_invite;
	}

	/**
	 * @param guest_can_invite the guest_can_invite to set
	 */
	public void setGuest_can_invite(boolean guest_can_invite) {
		this.guest_can_invite = guest_can_invite;
	}

	/**
	 * @return the view_all_guest
	 */
	public boolean isView_all_guest() {
		return view_all_guest;
	}

	/**
	 * @param view_all_guest the view_all_guest to set
	 */
	public void setView_all_guest(boolean view_all_guest) {
		this.view_all_guest = view_all_guest;
	}

	/**
	 * @return the item_preparing
	 */
	public String getItem_preparing() {
		return item_preparing;
	}

	/**
	 * @param item_preparing the item_preparing to set
	 */
	public void setItem_preparing(String item_preparing) {
		this.item_preparing = item_preparing;
	}

	/**
	 * @return the is_public
	 */
	public boolean isIs_public() {
		return is_public;
	}

	/**
	 * @param is_public the is_public to set
	 */
	public void setIs_public(boolean is_public) {
		this.is_public = is_public;
	}

	/**
	 * @return the is_cancel
	 */
	public boolean isIs_cancel() {
		return is_cancel;
	}

	/**
	 * @param is_cancel the is_cancel to set
	 */
	public void setIs_cancel(boolean is_cancel) {
		this.is_cancel = is_cancel;
	}

	/**
	 * @return the is_delete
	 */
	public boolean isIs_delete() {
		return is_delete;
	}

	/**
	 * @param is_delete the is_delete to set
	 */
	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}

	/**
	 * @return the time_create
	 */
	public String getTime_create() {
		return time_create;
	}

	/**
	 * @param time_create the time_create to set
	 */
	public void setTime_create(String time_create) {
		this.time_create = time_create;
	}

	/**
	 * @return the last_edit
	 */
	public String getLast_edit() {
		return last_edit;
	}

	/**
	 * @param last_edit the last_edit to set
	 */
	public void setLast_edit(String last_edit) {
		this.last_edit = last_edit;
	}

	/**
	 * @return the user_edit
	 */
	public Integer getUser_edit() {
		return user_edit;
	}

	/**
	 * @param user_edit the user_edit to set
	 */
	public void setUser_edit(Integer user_edit) {
		this.user_edit = user_edit;
	}

	/**
	 * @return the status
	 */
	public short getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(short status) {
		this.status = status;
	}
}
