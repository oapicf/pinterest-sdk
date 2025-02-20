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


type CardType* {.pure.} = enum
  UNKNOWN
  VISA
  MASTERCARD
  AMERICANEXPRESS
  DISCOVER
  ELO

type Status* {.pure.} = enum
  UNSPECIFIED
  VALID
  INVALID
  PENDING
  DELETED
  SECONDARY
  PENDINGSECONDARY

type PaymentMethodBrand* {.pure.} = enum
  UNKNOWN
  VISA
  MASTERCARD
  AMERICANEXPRESS
  DISCOVER
  SOFORT
  DINERSCLUB
  ELO
  CARTEBANCAIRE

type BillingProfilesResponse* = object
  ## 
  id*: string ## Billing ID.
  cardType*: CardType ## Type of the card.
  status*: Status ## Status of the billing.
  advertiserId*: string ## Advertiser ID of the billing.
  paymentMethodBrand*: PaymentMethodBrand ## Brand of the payment method.

func `%`*(v: CardType): JsonNode =
  let str = case v:
    of CardType.UNKNOWN: "UNKNOWN"
    of CardType.VISA: "VISA"
    of CardType.MASTERCARD: "MASTERCARD"
    of CardType.AMERICANEXPRESS: "AMERICAN_EXPRESS"
    of CardType.DISCOVER: "DISCOVER"
    of CardType.ELO: "ELO"

  JsonNode(kind: JString, str: str)

func `$`*(v: CardType): string =
  result = case v:
    of CardType.UNKNOWN: "UNKNOWN"
    of CardType.VISA: "VISA"
    of CardType.MASTERCARD: "MASTERCARD"
    of CardType.AMERICANEXPRESS: "AMERICAN_EXPRESS"
    of CardType.DISCOVER: "DISCOVER"
    of CardType.ELO: "ELO"

func `%`*(v: Status): JsonNode =
  let str = case v:
    of Status.UNSPECIFIED: "UNSPECIFIED"
    of Status.VALID: "VALID"
    of Status.INVALID: "INVALID"
    of Status.PENDING: "PENDING"
    of Status.DELETED: "DELETED"
    of Status.SECONDARY: "SECONDARY"
    of Status.PENDINGSECONDARY: "PENDING_SECONDARY"

  JsonNode(kind: JString, str: str)

func `$`*(v: Status): string =
  result = case v:
    of Status.UNSPECIFIED: "UNSPECIFIED"
    of Status.VALID: "VALID"
    of Status.INVALID: "INVALID"
    of Status.PENDING: "PENDING"
    of Status.DELETED: "DELETED"
    of Status.SECONDARY: "SECONDARY"
    of Status.PENDINGSECONDARY: "PENDING_SECONDARY"

func `%`*(v: PaymentMethodBrand): JsonNode =
  let str = case v:
    of PaymentMethodBrand.UNKNOWN: "UNKNOWN"
    of PaymentMethodBrand.VISA: "VISA"
    of PaymentMethodBrand.MASTERCARD: "MASTERCARD"
    of PaymentMethodBrand.AMERICANEXPRESS: "AMERICAN_EXPRESS"
    of PaymentMethodBrand.DISCOVER: "DISCOVER"
    of PaymentMethodBrand.SOFORT: "SOFORT"
    of PaymentMethodBrand.DINERSCLUB: "DINERS_CLUB"
    of PaymentMethodBrand.ELO: "ELO"
    of PaymentMethodBrand.CARTEBANCAIRE: "CARTE_BANCAIRE"

  JsonNode(kind: JString, str: str)

func `$`*(v: PaymentMethodBrand): string =
  result = case v:
    of PaymentMethodBrand.UNKNOWN: "UNKNOWN"
    of PaymentMethodBrand.VISA: "VISA"
    of PaymentMethodBrand.MASTERCARD: "MASTERCARD"
    of PaymentMethodBrand.AMERICANEXPRESS: "AMERICAN_EXPRESS"
    of PaymentMethodBrand.DISCOVER: "DISCOVER"
    of PaymentMethodBrand.SOFORT: "SOFORT"
    of PaymentMethodBrand.DINERSCLUB: "DINERS_CLUB"
    of PaymentMethodBrand.ELO: "ELO"
    of PaymentMethodBrand.CARTEBANCAIRE: "CARTE_BANCAIRE"
