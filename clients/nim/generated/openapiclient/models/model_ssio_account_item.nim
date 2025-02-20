#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_ssio_account_address

type SSIOAccountItem* = object
  ## 
  id*: string ## Salesforce id for billto_info
  ioTermsId*: string ## Salesforce id for IO Terms and Conditions
  ioTerms*: string ## Salesforce text for IO Terms and Conditions
  usTermsId*: string ## Salesforce id for US Terms and Conditions
  usTerms*: string ## Salesforce text for US Terms and Conditions
  rowTermsId*: string ## Salesforce id for Rest of the World Terms and Conditions
  rowTerms*: string ## Salesforce text for Rest of the World Terms and Conditions
  ioType*: string ## Insertion Order Type - Pinterest Paper or Agency Paper
  addresses*: seq[SSIOAccountAddress] ## Address information that is associated with this account.
