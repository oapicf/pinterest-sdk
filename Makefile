SPEC_URI=https://raw.githubusercontent.com/pinterest/api-description/main/v5/openapi.yaml

ci:
	make -f Makefile-swaggy-c ci \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=/home/runner/work/pinterest-sdk/pinterest-sdk
	make overwrite-spec
	make -f Makefile-swaggy-c ci \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=/home/runner/work/pinterest-sdk/pinterest-sdk

generate:
	make -f Makefile-swaggy-c clean deps init-spec \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=/Users/cliffano/dev/workspace-studio/pinterest-sdk
	make overwrite-spec
	make -f Makefile-swaggy-c generate-primary build-javascript build-python build-ruby test-javascript test-python test-ruby doc \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=/Users/cliffano/dev/workspace-studio/pinterest-sdk

overwrite-spec:
	yq -i '.info.contact.name = "Cliffano Subagio" | .info.contact.url = "https://github.com/cliffano/pinterest-sdk" | .info.contact.email = "blah@cliffano.com"' stage/specification.yml

publish-javascript:
	make -f Makefile-swaggy-c publish-javascript

publish-python:
	make -f Makefile-swaggy-c publish-python

publish-ruby:
	make -f Makefile-swaggy-c publish-ruby

doc-publish:
	make -f Makefile-swaggy-c deps init-spec doc-latest doc-publish \
	  SPEC_URI=${SPEC_URI} \

.PHONY: ci generate publish-javascript publish-python publish-ruby doc-publish