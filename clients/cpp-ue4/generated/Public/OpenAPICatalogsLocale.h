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

namespace OpenAPI
{

/*
 * OpenAPICatalogsLocale
 *
 * 
 */
class OPENAPI_API OpenAPICatalogsLocale : public Model
{
public:
    virtual ~OpenAPICatalogsLocale() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class Values
	{
		AfZA,
		ArSA,
		BgBG,
		BnIN,
		CsCZ,
		DaDK,
		De,
		ElGR,
		EnAU,
		EnCA,
		EnGB,
		EnIN,
		EnUS,
		Es419,
		EsAR,
		EsES,
		EsMX,
		FiFI,
		Fr,
		FrCA,
		HeIL,
		HiIN,
		HrHR,
		HuHU,
		IdID,
		It,
		Ja,
		KoKR,
		MsMY,
		NbNO,
		Nl,
		PlPL,
		PtBR,
		PtPT,
		RoRO,
		RuRU,
		SkSK,
		SvSE,
		TeIN,
		ThTH,
		TlPH,
		Tr,
		UkUA,
		ViVN,
		ZhCN,
		ZhTW,
  	};

	Values Value;

	static FString EnumToString(const Values& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, Values& EnumValue);
};

}
