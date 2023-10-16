/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.dspace.app.rest.RestResourceController;

/**
 * This class is the REST representation of the COARNotify model object and acts as a data object
 * for the SubmissionCOARNotifyResource class.
 * Refer to {@link org.dspace.coarnotify.COARNotify} for explanation of the properties
 */
public class SubmissionCOARNotifyRest extends BaseObjectRest<String> {
    public static final String NAME = "submissioncoarnotifyconfig";
    public static final String CATEGORY = RestAddressableModel.CONFIGURATION;

    private String id;

    private List<String> patterns;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public List<String> getPatterns() {
        return patterns;
    }

    public void setPatterns(final List<String> patterns) {
        this.patterns = patterns;
    }

    @JsonIgnore
    @Override
    public String getCategory() {
        return CATEGORY;
    }

    @Override
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public String getType() {
        return NAME;
    }

    @Override
    @JsonIgnore
    public Class getController() {
        return RestResourceController.class;
    }
}
