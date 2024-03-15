/*
 * CatalogsHotelGuestRatings.h
 *
 * If specified, you must provide all properties
 */

#ifndef _CatalogsHotelGuestRatings_H_
#define _CatalogsHotelGuestRatings_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief If specified, you must provide all properties
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelGuestRatings : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelGuestRatings();
	CatalogsHotelGuestRatings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelGuestRatings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Your hotel's rating.
	 */
	long long getScore();

	/*! \brief Set Your hotel's rating.
	 */
	void setScore(long long  score);
	/*! \brief Get Total number of people who have rated this hotel.
	 */
	int getNumberOfReviewers();

	/*! \brief Set Total number of people who have rated this hotel.
	 */
	void setNumberOfReviewers(int  number_of_reviewers);
	/*! \brief Get Max value for the hotel rating score.
	 */
	long long getMaxScore();

	/*! \brief Set Max value for the hotel rating score.
	 */
	void setMaxScore(long long  max_score);
	/*! \brief Get System you use for guest reviews.
	 */
	std::string getRatingSystem();

	/*! \brief Set System you use for guest reviews.
	 */
	void setRatingSystem(std::string  rating_system);

private:
	long long score;
	int number_of_reviewers;
	long long max_score;
	std::string rating_system;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelGuestRatings_H_ */
