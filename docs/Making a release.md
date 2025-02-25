# Making a release

#### Step 1: Generate messages (Only if test messages changed. Only affects tests.)

Run `us.ihmc.pubsub.examples.GenerateTestMessages` 
with `ihmc-pub-sub-generator/src/test` set as the working directory.

> Note: If using IntelliJ, this might require "Build, no error check"

Make sure the generated files have LF (Unix) line separators.

#### Step 2: Ensure tests are passing

Use Bamboo or run tests manually.

##### Running tests locally

```
> cd /path/to/ihmc-pub-sub-group
> gradle compositeTask -PtaskName=test
```
Visit these urls to view test results:

```
file:///path/to/ihmc-pub-sub-group/ihmc-pub-sub/src/test/build/reports/tests/test/index.html
file:///path/to/ihmc-pub-sub-group/ihmc-pub-sub-generator/src/test/build/reports/tests/test/index.html
```

Notes: 
- Currently execution stops on `IntraprocessLargeCopyTest` and freezes forever. You have to run the tests manually in the IDE. There are a few that require setting up the allocation instrumenter.
- Currently `IntraprocessLargeCopyTest3` is flaky. Run it in the IDE a few times to see if it passes.

#### Step 3: Update version

In `ihmc-pub-sub-group/group.gradle.properties`, up the version number.

#### Step 4: Publish artifacts

Publish artifacts to Bintray.

`gradle compositePublish -PpublishUrl=ihmcRelease`

Check when they become available at [https://repo.maven.apache.org/maven2/us/ihmc/](https://repo.maven.apache.org/maven2/us/ihmc/).

#### Step 5: Draft and publish release on GitHub

1. Go to [https://github.com/ihmcrobotics/ihmc-pub-sub/releases](https://github.com/ihmcrobotics/ihmc-pub-sub/releases)
1. Click "Draft a new release"
1. Enter version X.X.X as the tag name
1. Title the release "X.X.X Release Notes"
1. Document all features, API changes, regressions, bug fixes, etc.
1. Tick the "This is a pre-release" box
1. Click "Publish release"