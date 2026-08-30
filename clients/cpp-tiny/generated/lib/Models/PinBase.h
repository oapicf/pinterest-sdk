
/*
 * PinBase.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PinBase_H_
#define TINY_CPP_CLIENT_PinBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AiDisclosures.h"
#include "BoardOwner.h"
#include "CreativeType.h"
#include "Object.h"
#include "PinMedia.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PinBase{
public:

    /*! \brief Constructor.
	 */
    PinBase();
    PinBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinBase();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get AI disclosure declarations the creator has made about this Pin.
	 */
	AiDisclosures getAiDisclosures();

	/*! \brief Set AI disclosure declarations the creator has made about this Pin.
	 */
	void setAiDisclosures(AiDisclosures ai_disclosures);
	/*! \brief Get The board to which this Pin belongs.
	 */
	std::string getBoardId();

	/*! \brief Set The board to which this Pin belongs.
	 */
	void setBoardId(std::string board_id);
	/*! \brief Get 
	 */
	BoardOwner getBoardOwner();

	/*! \brief Set 
	 */
	void setBoardOwner(BoardOwner board_owner);
	/*! \brief Get The board section to which this Pin belongs.
	 */
	std::string getBoardSectionId();

	/*! \brief Set The board section to which this Pin belongs.
	 */
	void setBoardSectionId(std::string board_section_id);
	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string created_at);
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType creative_type);
	/*! \brief Get Dominant pin color. Hex number, e.g. `#6E7874`.
	 */
	std::string getDominantColor();

	/*! \brief Set Dominant pin color. Hex number, e.g. `#6E7874`.
	 */
	void setDominantColor(std::string dominant_color);
	/*! \brief Get Whether the Pin has been promoted or not.
	 */
	bool isHasBeenPromoted();

	/*! \brief Set Whether the Pin has been promoted or not.
	 */
	void setHasBeenPromoted(bool has_been_promoted);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get Whether the \"operation user_account\" is the Pin owner.
	 */
	bool isIsOwner();

	/*! \brief Set Whether the \"operation user_account\" is the Pin owner.
	 */
	void setIsOwner(bool is_owner);
	/*! \brief Get Whether the Pin is a product Pin.
	 */
	bool isIsProduct();

	/*! \brief Set Whether the Pin is a product Pin.
	 */
	void setIsProduct(bool is_product);
	/*! \brief Get Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
	 */
	bool isIsStandard();

	/*! \brief Set Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
	 */
	void setIsStandard(bool is_standard);
	/*! \brief Get 
	 */
	PinMedia getMedia();

	/*! \brief Set 
	 */
	void setMedia(PinMedia media);
	/*! \brief Get The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
	 */
	std::string getParentPinId();

	/*! \brief Set The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
	 */
	void setParentPinId(std::string parent_pin_id);
	/*! \brief Get Pin metrics with associated time intervals if any.
	 */
	Object getPinMetrics();

	/*! \brief Set Pin metrics with associated time intervals if any.
	 */
	void setPinMetrics(Object pin_metrics);


    private:
    AiDisclosures ai_disclosures;
    std::string board_id{};
    BoardOwner board_owner;
    std::string board_section_id{};
    std::string created_at{};
    CreativeType creative_type;
    std::string dominant_color{};
    bool has_been_promoted{};
    std::string id{};
    bool is_owner{};
    bool is_product{};
    bool is_standard{};
    PinMedia media;
    std::string parent_pin_id{};
    Object pin_metrics;
};
}

#endif /* TINY_CPP_CLIENT_PinBase_H_ */
