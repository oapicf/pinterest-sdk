/*
 * ConversionHealthSelectionItem.h
 *
 * User selection of conversion health criteria for a single feature
 */

#ifndef _ConversionHealthSelectionItem_H_
#define _ConversionHealthSelectionItem_H_


#include <string>
#include "AnyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief User selection of conversion health criteria for a single feature
 *
 *  \ingroup Models
 *
 */

class ConversionHealthSelectionItem : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionHealthSelectionItem();
	ConversionHealthSelectionItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionHealthSelectionItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Status for conversion types
	 */
	std::string getConversionType();

	/*! \brief Set Status for conversion types
	 */
	void setConversionType(std::string  conversionType);
	/*! \brief Get Status for criteria
	 */
	std::string getCriteria();

	/*! \brief Set Status for criteria
	 */
	void setCriteria(std::string  criteria);
	/*! \brief Get Status for ingestion sources
	 */
	std::string getIngestionSource();

	/*! \brief Set Status for ingestion sources
	 */
	void setIngestionSource(std::string  ingestionSource);
	/*! \brief Get Overall status for this selection item
	 */
	AnyType getStatus();

	/*! \brief Set Overall status for this selection item
	 */
	void setStatus(AnyType  status);

private:
	std::string conversionType;
	std::string criteria;
	std::string ingestionSource;
	AnyType status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionHealthSelectionItem_H_ */
