
package fi.soveltia.liferay.gsearch.mini.web.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

/**
 * GSearch Mini Web module configuration.
 * 
 * @author Petteri Karttunen
 *
 */
@ExtendedObjectClassDefinition(
	category = "GSearch"
)
@Meta.OCD(
	id = "fi.soveltia.liferay.gsearch.mini.web.configuration.ModuleConfiguration",
	localization = "content/Language",
	name = "Mini Portlet"
)
public interface ModuleConfiguration {

	@Meta.AD(
		deflt = "keywords", 
	    description = "suggest-mode-desc",
	    name = "suggest-mode-name",
	    optionLabels = {"Keywords", "Contents"},
	    optionValues = {"keywords", "contents"},
		required = false
	)
	public String suggestMode();

	@Meta.AD(
		deflt = "7", 
	    name = "content-suggestions-count-name",
		required = false
	)
	public int contentSuggestionsCount();
	
	
	@Meta.AD(
		deflt = "/search", 
	    name = "search-portlet-page-name",
	    description = "search-portlet-page-desc",
		required = false
	)
	public String searchPortletPage();

	@Meta.AD(
		deflt = "/viewasset", 
	    name = "asset-publisher-page-name",
	    description = "asset-publisher-page-desc",
		required = false
	)
	public String assetPublisherPage();	
	
	@Meta.AD(
		deflt = "/search", 
	    name = "hide-on-pages-name",
	    description = "hide-on-pages-desc",
		required = false
	)
	public String[] hideOnPages();
	
	@Meta.AD(
		deflt = "false", 
		description = "view-in-context-desc",
	    name = "view-in-context-name",
		required = false
	)
	public boolean isViewResultsInContext();	
	
	@Meta.AD(
		deflt = "3", 
	    name = "keywords-min-length",
		required = false
	)
	public int queryMinLength();
	
	@Meta.AD(
		deflt = "true", 
	    name = "enable-autocompletion-name",
	    description = "enable-autocompletion-desc",
		required = false
	)
	public boolean enableAutoComplete();

	@Meta.AD(
		deflt = "150", 
	    description = "autocomplete-delay-desc",
	    name = "autocomplete-delay-name",
		required = false
	)
	public int autoCompleteRequestDelay();	

	@Meta.AD(
		deflt = "10000", 
		description = "request-timeout-desc",
	    name = "request-timeout-name",
		required = false
	)
	public int requestTimeout();
}
