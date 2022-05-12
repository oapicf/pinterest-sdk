<img align="right" src="https://raw.github.com/cliffano/pinterest-sdk/master/avatar.jpg" alt="Avatar"/>

[![Build Status](https://github.com/cliffano/pinterest-sdk/actions/workflows/ci-workflow.yaml/badge.svg)](https://github.com/cliffano/pinterest-sdk/actions/workflows/ci-workflow.yaml)
<br/>

Pinterest SDK
-------------

Pinterest SDK is a set of generated client libraries for [Pinterest REST API](https://developers.pinterest.com/docs/api/v5/) from their [OpenAPI v3 specification](https://github.com/pinterest/api-description).

The client libraries are generated using [OpenAPI Generator](https://openapi-generator.tech/).

Published packages
------------------

| Language | Package | Status |
|----------|---------|--------|
| JavaScript | [pinterest-sdk]((http://www.npmjs.com/package/pinterest-sdk)) | [![Published Version](https://img.shields.io/npm/v/pinterest-sdk.svg)](http://www.npmjs.com/package/pinterest-sdk) |
| Python | [pinterestsdk]((https://pypi.python.org/pypi/pinterestsdk)) | [![Published Version](https://img.shields.io/pypi/v/pinterestsdk.svg)](https://pypi.python.org/pypi/pinterestsdk) |
| Ruby | [pinterest_sdk]((https://rubygems.org/gems/pinterest_sdk)) | [![Published Version](https://img.shields.io/gem/v/pinterest_sdk.svg)](https://rubygems.org/gems/pinterest_sdk) |

Version Matrix
--------------

| Pinterest SDK Version | Pinterest OpenAPI Spec Version | OpenAPI Version | OpenAPI Generator Version |
|-----------------------|--------------------------------|-----------------|---------------------------|
| 1.0.0 | 5.3.0 | 3.0.3 | 5.4.0 |

Usage
-----

Generate client libraries of the currently supported languages:

    make generate GEN_BASE_DIR=<path/to/pinterest-sdk>

Installation
------------

You can either use the generated clients from `clients/<lang>/generated/` directory.

Or you can use the published packages like below:

Install JavaScript client:

    npm install pinterest-sdk

Install Python client:

    pip install pinterestsdk

Install Ruby client:

    gem install pinterest_sdk

Colophon
--------

* [API Documentation](http://cliffano.github.io/pinterest-sdk/api/latest/)
