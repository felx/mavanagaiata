/**
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the new BSD License.
 *
 * Copyright (c) 2012, Sebastian Staudt
 */

package com.github.koraktor.mavanagaiata.git;

import java.util.Date;
import java.util.TimeZone;

/**
 * This interface specifies the basic properties needed for the mojos to access
 * the information about a Git commit
 *
 * @author Sebastian Staudt
 */
public interface GitCommit {

    /**
     * Returns the date when this commit has been authored
     *
     * @return The author date of this commit
     */
    public Date getAuthorDate();

    /**
     * Returns the email address of the author of this commit
     *
     * @return The commit author's email address
     */
    public String getAuthorEmailAddress();

    /**
     * Returns the name of the author of this commit
     *
     * @return The commit author's name
     */
    public String getAuthorName();

    /**
     * Returns the timezone in which this commit has been authored
     *
     * @return The author timezone of this commit
     */
    public TimeZone getAuthorTimeZone();

    /**
     * Returns the date when this commit has been committed
     *
     * @return The committer date of this commit
     */
    public Date getCommitterDate();

    /**
     * Returns the email address of the committer
     *
     * @return The committer's email address
     */
    public String getCommitterEmailAddress();

    /**
     * Returns the name of the committer
     *
     * @return The committer's name
     */
    public String getCommitterName();

    /**
     * Returns the timezone in which this commit has been committed
     *
     * @return The committer timezone of this commit
     */
    public TimeZone getCommitterTimeZone();

    /**
     * Returns the SHA hash ID of this commit
     *
     * @return The SHA ID of this commit
     */
    public String getId();

    /**
     * Returns the subject of the commit's message
     * <p>
     * The message subject is the first line of the commit message.
     *
     * @return The message subject of this commit
     */
    public String getMessageSubject();

}
