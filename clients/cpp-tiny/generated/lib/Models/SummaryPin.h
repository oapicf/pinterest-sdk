
/*
 * SummaryPin.h
 *
 * Summarized pin information
 */

#ifndef TINY_CPP_CLIENT_SummaryPin_H_
#define TINY_CPP_CLIENT_SummaryPin_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PinMedia.h"

namespace Tiny {


/*! \brief Summarized pin information
 *
 *  \ingroup Models
 *
 */

class SummaryPin{
public:

    /*! \brief Constructor.
	 */
    SummaryPin();
    SummaryPin(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SummaryPin();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAltText();

	/*! \brief Set 
	 */
	void setAltText(std::string  alt_text);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	PinMedia getMedia();

	/*! \brief Set 
	 */
	void setMedia(PinMedia  media);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);


    private:
    std::string alt_text{};
    std::string description{};
    std::string id{};
    std::string link{};
    PinMedia media;
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_SummaryPin_H_ */
