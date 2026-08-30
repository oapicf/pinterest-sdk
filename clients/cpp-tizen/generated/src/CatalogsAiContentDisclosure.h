/*
 * CatalogsAiContentDisclosure.h
 *
 * AI content disclosure for a single asset of a catalog item.
 */

#ifndef _CatalogsAiContentDisclosure_H_
#define _CatalogsAiContentDisclosure_H_


#include <string>
#include "CatalogsAiContentDisclosureLabel.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief AI content disclosure for a single asset of a catalog item.
 *
 *  \ingroup Models
 *
 */

class CatalogsAiContentDisclosure : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsAiContentDisclosure();
	CatalogsAiContentDisclosure(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsAiContentDisclosure();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Disclosure labels that apply to this asset.
	 */
	std::list<CatalogsAiContentDisclosureLabel> getDisclosure();

	/*! \brief Set Disclosure labels that apply to this asset.
	 */
	void setDisclosure(std::list <CatalogsAiContentDisclosureLabel> disclosure);
	/*! \brief Get URL of the asset. Must match one of image_link, additional_image_link, or video_link.
	 */
	std::string getUrl();

	/*! \brief Set URL of the asset. Must match one of image_link, additional_image_link, or video_link.
	 */
	void setUrl(std::string  url);

private:
	std::list <CatalogsAiContentDisclosureLabel>disclosure;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsAiContentDisclosure_H_ */
