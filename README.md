# JIRA notloggedin plugin

A plugin that redirects the browser to the login page if either the view
or create issue pages are viewed when the user is not logged in.

This plugin is intended to prevent users from making accidental changes
to issues when they're not logged in. If you require a secure way of
preventing anonymous access to these pages use JIRA's permission settings
instead.

## Running in the development environment

Clone this repo to the same place as the JIRA installation, e.g.,

    atlas/
      - amps-standalone/
          - ...
      - notloggedin-jira-plugin/
          - ...

You can then `cd` into the clone and run it.

    cd notloggedin-jira-plugin
    atlas-run

## Packaging

    atlas-mvn package

The plugin is now available at `target/notloggedin-1.0-SNAPSHOT.jar`.
