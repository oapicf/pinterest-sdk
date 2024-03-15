#' Create a new AdGroupAudienceSizingResponse
#'
#' @description
#' AdGroupAudienceSizingResponse Class
#'
#' @docType class
#' @title AdGroupAudienceSizingResponse
#' @description AdGroupAudienceSizingResponse Class
#' @format An \code{R6Class} generator object
#' @field audience_size_lower_bound The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. numeric [optional]
#' @field audience_size_upper_bound The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupAudienceSizingResponse <- R6::R6Class(
  "AdGroupAudienceSizingResponse",
  public = list(
    `audience_size_lower_bound` = NULL,
    `audience_size_upper_bound` = NULL,
    #' Initialize a new AdGroupAudienceSizingResponse class.
    #'
    #' @description
    #' Initialize a new AdGroupAudienceSizingResponse class.
    #'
    #' @param audience_size_lower_bound The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    #' @param audience_size_upper_bound The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`audience_size_lower_bound` = NULL, `audience_size_upper_bound` = NULL, ...) {
      if (!is.null(`audience_size_lower_bound`)) {
        self$`audience_size_lower_bound` <- `audience_size_lower_bound`
      }
      if (!is.null(`audience_size_upper_bound`)) {
        self$`audience_size_upper_bound` <- `audience_size_upper_bound`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupAudienceSizingResponse in JSON format
    #' @export
    toJSON = function() {
      AdGroupAudienceSizingResponseObject <- list()
      if (!is.null(self$`audience_size_lower_bound`)) {
        AdGroupAudienceSizingResponseObject[["audience_size_lower_bound"]] <-
          self$`audience_size_lower_bound`
      }
      if (!is.null(self$`audience_size_upper_bound`)) {
        AdGroupAudienceSizingResponseObject[["audience_size_upper_bound"]] <-
          self$`audience_size_upper_bound`
      }
      AdGroupAudienceSizingResponseObject
    },
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_size_lower_bound`)) {
        self$`audience_size_lower_bound` <- this_object$`audience_size_lower_bound`
      }
      if (!is.null(this_object$`audience_size_upper_bound`)) {
        self$`audience_size_upper_bound` <- this_object$`audience_size_upper_bound`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdGroupAudienceSizingResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`audience_size_lower_bound`)) {
          sprintf(
          '"audience_size_lower_bound":
            %d
                    ',
          self$`audience_size_lower_bound`
          )
        },
        if (!is.null(self$`audience_size_upper_bound`)) {
          sprintf(
          '"audience_size_upper_bound":
            %d
                    ',
          self$`audience_size_upper_bound`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdGroupAudienceSizingResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupAudienceSizingResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_size_lower_bound` <- this_object$`audience_size_lower_bound`
      self$`audience_size_upper_bound` <- this_object$`audience_size_upper_bound`
      self
    },
    #' Validate JSON input with respect to AdGroupAudienceSizingResponse
    #'
    #' @description
    #' Validate JSON input with respect to AdGroupAudienceSizingResponse and throw an exception if invalid
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
    #' @return String representation of AdGroupAudienceSizingResponse
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
# AdGroupAudienceSizingResponse$unlock()
#
## Below is an example to define the print function
# AdGroupAudienceSizingResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupAudienceSizingResponse$lock()

