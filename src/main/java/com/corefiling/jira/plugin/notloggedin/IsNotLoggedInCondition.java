package com.corefiling.jira.plugin.notloggedin;

import java.util.Map;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.plugin.PluginParseException;
import com.atlassian.plugin.web.Condition;

/**
 * Used to determine if any user is currently logged in. 
 * 
 * @copyright
 * @author pwc
 */
public class IsNotLoggedInCondition implements Condition {

  @Override
  public void init(Map<String, String> params) throws PluginParseException {
    // context parameters are unused
  }

  @Override
  public boolean shouldDisplay(Map<String, Object> context) {
    return ComponentAccessor.getJiraAuthenticationContext().getUser() == null;
  }
}
