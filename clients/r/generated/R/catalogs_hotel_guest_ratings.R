#' Create a new CatalogsHotelGuestRatings
#'
#' @description
#' If specified, you must provide all properties
#'
#' @docType class
#' @title CatalogsHotelGuestRatings
#' @description CatalogsHotelGuestRatings Class
#' @format An \code{R6Class} generator object
#' @field score Your hotel's rating. numeric [optional]
#' @field number_of_reviewers Total number of people who have rated this hotel. integer [optional]
#' @field max_score Max value for the hotel rating score. numeric [optional]
#' @field rating_system System you use for guest reviews. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelGuestRatings <- R6::R6Class(
  "CatalogsHotelGuestRatings",
  public = list(
    `score` = NULL,
    `number_of_reviewers` = NULL,
    `max_score` = NULL,
    `rating_system` = NULL,
    #' Initialize a new CatalogsHotelGuestRatings class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelGuestRatings class.
    #'
    #' @param score Your hotel's rating.
    #' @param number_of_reviewers Total number of people who have rated this hotel.
    #' @param max_score Max value for the hotel rating score.
    #' @param rating_system System you use for guest reviews.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`score` = NULL, `number_of_reviewers` = NULL, `max_score` = NULL, `rating_system` = NULL, ...) {
      if (!is.null(`score`)) {
        self$`score` <- `score`
      }
      if (!is.null(`number_of_reviewers`)) {
        if (!(is.numeric(`number_of_reviewers`) && length(`number_of_reviewers`) == 1)) {
          stop(paste("Error! Invalid data for `number_of_reviewers`. Must be an integer:", `number_of_reviewers`))
        }
        self$`number_of_reviewers` <- `number_of_reviewers`
      }
      if (!is.null(`max_score`)) {
        self$`max_score` <- `max_score`
      }
      if (!is.null(`rating_system`)) {
        if (!(is.character(`rating_system`) && length(`rating_system`) == 1)) {
          stop(paste("Error! Invalid data for `rating_system`. Must be a string:", `rating_system`))
        }
        self$`rating_system` <- `rating_system`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelGuestRatings in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelGuestRatingsObject <- list()
      if (!is.null(self$`score`)) {
        CatalogsHotelGuestRatingsObject[["score"]] <-
          self$`score`
      }
      if (!is.null(self$`number_of_reviewers`)) {
        CatalogsHotelGuestRatingsObject[["number_of_reviewers"]] <-
          self$`number_of_reviewers`
      }
      if (!is.null(self$`max_score`)) {
        CatalogsHotelGuestRatingsObject[["max_score"]] <-
          self$`max_score`
      }
      if (!is.null(self$`rating_system`)) {
        CatalogsHotelGuestRatingsObject[["rating_system"]] <-
          self$`rating_system`
      }
      CatalogsHotelGuestRatingsObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelGuestRatings
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelGuestRatings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelGuestRatings
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`score`)) {
        self$`score` <- this_object$`score`
      }
      if (!is.null(this_object$`number_of_reviewers`)) {
        self$`number_of_reviewers` <- this_object$`number_of_reviewers`
      }
      if (!is.null(this_object$`max_score`)) {
        self$`max_score` <- this_object$`max_score`
      }
      if (!is.null(this_object$`rating_system`)) {
        self$`rating_system` <- this_object$`rating_system`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelGuestRatings in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`score`)) {
          sprintf(
          '"score":
            %d
                    ',
          self$`score`
          )
        },
        if (!is.null(self$`number_of_reviewers`)) {
          sprintf(
          '"number_of_reviewers":
            %d
                    ',
          self$`number_of_reviewers`
          )
        },
        if (!is.null(self$`max_score`)) {
          sprintf(
          '"max_score":
            %d
                    ',
          self$`max_score`
          )
        },
        if (!is.null(self$`rating_system`)) {
          sprintf(
          '"rating_system":
            "%s"
                    ',
          self$`rating_system`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsHotelGuestRatings
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelGuestRatings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelGuestRatings
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`score` <- this_object$`score`
      self$`number_of_reviewers` <- this_object$`number_of_reviewers`
      self$`max_score` <- this_object$`max_score`
      self$`rating_system` <- this_object$`rating_system`
      self
    },
    #' Validate JSON input with respect to CatalogsHotelGuestRatings
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelGuestRatings and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelGuestRatings
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsHotelGuestRatings$unlock()
#
## Below is an example to define the print function
# CatalogsHotelGuestRatings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelGuestRatings$lock()

