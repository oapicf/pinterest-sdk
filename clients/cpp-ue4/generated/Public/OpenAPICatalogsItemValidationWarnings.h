/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPICatalogsItemValidationDetails.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsItemValidationWarnings
 *
 * 
 */
class OPENAPI_API OpenAPICatalogsItemValidationWarnings : public Model
{
public:
    virtual ~OpenAPICatalogsItemValidationWarnings() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPICatalogsItemValidationDetails> AdLinkFormatWarning;
	TOptional<OpenAPICatalogsItemValidationDetails> AdLinkSameAsLink;
	TOptional<OpenAPICatalogsItemValidationDetails> AdditionalImageLinkLengthTooLong;
	TOptional<OpenAPICatalogsItemValidationDetails> AdditionalImageLinkWarning;
	TOptional<OpenAPICatalogsItemValidationDetails> AdwordsFormatWarning;
	TOptional<OpenAPICatalogsItemValidationDetails> AdwordsSameAsLink;
	TOptional<OpenAPICatalogsItemValidationDetails> AgeGroupInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> SizeSystemInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> AndroidDeepLinkInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> AvailabilityDateInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> CountryDoesNotMapToCurrency;
	TOptional<OpenAPICatalogsItemValidationDetails> CustomLabelLengthTooLong;
	TOptional<OpenAPICatalogsItemValidationDetails> DescriptionLengthTooLong;
	TOptional<OpenAPICatalogsItemValidationDetails> ExpirationDateInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> GenderInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> GtinInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> ImageLinkWarning;
	TOptional<OpenAPICatalogsItemValidationDetails> IosDeepLinkInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> IsBundleInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> ItemAdditionalImageDownloadFailure;
	TOptional<OpenAPICatalogsItemValidationDetails> LinkFormatWarning;
	TOptional<OpenAPICatalogsItemValidationDetails> MinAdPriceInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> MpnInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> MultipackInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> OptionalConditionInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> OptionalConditionMissing;
	TOptional<OpenAPICatalogsItemValidationDetails> OptionalProductCategoryInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> OptionalProductCategoryMissing;
	TOptional<OpenAPICatalogsItemValidationDetails> ProductCategoryDepthWarning;
	TOptional<OpenAPICatalogsItemValidationDetails> ProductTypeLengthTooLong;
	TOptional<OpenAPICatalogsItemValidationDetails> SalesPriceInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> SalesPriceTooLow;
	TOptional<OpenAPICatalogsItemValidationDetails> SalesPriceTooHigh;
	TOptional<OpenAPICatalogsItemValidationDetails> SaleDateInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> ShippingInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> ShippingHeightInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> ShippingWeightInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> ShippingWidthInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> SizeTypeInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> TaxInvalid;
	TOptional<OpenAPICatalogsItemValidationDetails> TitleLengthTooLong;
	TOptional<OpenAPICatalogsItemValidationDetails> TooManyAdditionalImageLinks;
	TOptional<OpenAPICatalogsItemValidationDetails> UtmSourceAutoCorrected;
	TOptional<OpenAPICatalogsItemValidationDetails> WeightUnitInvalid;
};

}
