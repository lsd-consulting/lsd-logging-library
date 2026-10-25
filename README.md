[![semantic-release](https://img.shields.io/badge/semantic-release-e10079.svg?logo=semantic-release)](https://github.com/semantic-release/semantic-release)

# lsd-logging-library

![GitHub](https://img.shields.io/github/license/lsd-consulting/lsd-logging-library)
![Codecov](https://img.shields.io/codecov/c/github/lsd-consulting/lsd-logging-library)
![lsd-logging-library Actions](https://api.meercode.io/badge/lsd-consulting/lsd-logging-library?type=ci-score&branch=main&lastDay=14)

[![CI](https://github.com/lsd-consulting/lsd-logging-library/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/lsd-consulting/lsd-logging-library/actions/workflows/ci.yml)
[![Nightly Build](https://github.com/lsd-consulting/lsd-logging-library/actions/workflows/nightly.yml/badge.svg)](https://github.com/lsd-consulting/lsd-logging-library/actions/workflows/nightly.yml)
[![GitHub release](https://img.shields.io/github/release/lsd-consulting/lsd-logging-library)](https://github.com/lsd-consulting/lsd-logging-library/releases)
![Maven Central](https://img.shields.io/maven-central/v/io.github.lsd-consulting/lsd-logging-library)

This is a micro library that provides Kotlin logging functionality.

## Releasing

Pushing to main builds but does not release. Maven Central limits the
io.github.lsd-consulting namespace to 7 releases a month, so each release is
started on purpose. semantic-release still picks the version from the feat/fix
commits since the last release, and does nothing if there are none.

Release by hand:

```
gh workflow run release.yml -R lsd-consulting/lsd-logging-library -f reason="why this release is needed"
```

To release weekly instead (Tuesday 07:00 UTC), set the repository variable
`WEEKLY_RELEASE` to `true`. It is off by default.
