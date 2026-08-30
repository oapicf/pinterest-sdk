
/*
 * CatalogsAiContentDisclosure.h
 *
 * AI content disclosure for a single asset of a catalog item.
 */

#ifndef TINY_CPP_CLIENT_CatalogsAiContentDisclosure_H_
#define TINY_CPP_CLIENT_CatalogsAiContentDisclosure_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsAiContentDisclosureLabel.h"
#include <list>

namespace Tiny {


/*! \brief AI content disclosure for a single asset of a catalog item.
 *
 *  \ingroup Models
 *
 */

class CatalogsAiContentDisclosure{
public:

    /*! \brief Constructor.
	 */
    CatalogsAiContentDisclosure();
    CatalogsAiContentDisclosure(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsAiContentDisclosure();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Disclosure labels that apply to this asset.
	 */
	std::list<CatalogsAiContentDisclosureLabel> getDisclosure();

	/*! \brief Set Disclosure labels that apply to this asset.
	 */
	void setDisclosure(std::list<CatalogsAiContentDisclosureLabel> disclosure);
	/*! \brief Get URL of the asset. Must match one of image_link, additional_image_link, or video_link.
	 */
	std::string getUrl();

	/*! \brief Set URL of the asset. Must match one of image_link, additional_image_link, or video_link.
	 */
	void setUrl(std::string url);


    private:
    std::list<CatalogsAiContentDisclosureLabel> disclosure;
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsAiContentDisclosure_H_ */
