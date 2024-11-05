#' Create a new TargetingTemplateAudienceSizingReachEstimate
#'
#' @description
#' TargetingTemplateAudienceSizingReachEstimate Class
#'
#' @docType class
#' @title TargetingTemplateAudienceSizingReachEstimate
#' @description TargetingTemplateAudienceSizingReachEstimate Class
#' @format An \code{R6Class} generator object
#' @field estimate  integer [optional]
#' @field lower_bound  integer [optional]
#' @field upper_bound  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingTemplateAudienceSizingReachEstimate <- R6::R6Class(
  "TargetingTemplateAudienceSizingReachEstimate",
  public = list(
    `estimate` = NULL,
    `lower_bound` = NULL,
    `upper_bound` = NULL,

    #' @description
    #' Initialize a new TargetingTemplateAudienceSizingReachEstimate class.
    #'
    #' @param estimate estimate
    #' @param lower_bound lower_bound
    #' @param upper_bound upper_bound
    #' @param ... Other optional arguments.
    initialize = function(`estimate` = NULL, `lower_bound` = NULL, `upper_bound` = NULL, ...) {
      if (!is.null(`estimate`)) {
        if (!(is.numeric(`estimate`) && length(`estimate`) == 1)) {
          stop(paste("Error! Invalid data for `estimate`. Must be an integer:", `estimate`))
        }
        self$`estimate` <- `estimate`
      }
      if (!is.null(`lower_bound`)) {
        if (!(is.numeric(`lower_bound`) && length(`lower_bound`) == 1)) {
          stop(paste("Error! Invalid data for `lower_bound`. Must be an integer:", `lower_bound`))
        }
        self$`lower_bound` <- `lower_bound`
      }
      if (!is.null(`upper_bound`)) {
        if (!(is.numeric(`upper_bound`) && length(`upper_bound`) == 1)) {
          stop(paste("Error! Invalid data for `upper_bound`. Must be an integer:", `upper_bound`))
        }
        self$`upper_bound` <- `upper_bound`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateAudienceSizingReachEstimate in JSON format
    toJSON = function() {
      TargetingTemplateAudienceSizingReachEstimateObject <- list()
      if (!is.null(self$`estimate`)) {
        TargetingTemplateAudienceSizingReachEstimateObject[["estimate"]] <-
          self$`estimate`
      }
      if (!is.null(self$`lower_bound`)) {
        TargetingTemplateAudienceSizingReachEstimateObject[["lower_bound"]] <-
          self$`lower_bound`
      }
      if (!is.null(self$`upper_bound`)) {
        TargetingTemplateAudienceSizingReachEstimateObject[["upper_bound"]] <-
          self$`upper_bound`
      }
      TargetingTemplateAudienceSizingReachEstimateObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateAudienceSizingReachEstimate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateAudienceSizingReachEstimate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`estimate`)) {
        self$`estimate` <- this_object$`estimate`
      }
      if (!is.null(this_object$`lower_bound`)) {
        self$`lower_bound` <- this_object$`lower_bound`
      }
      if (!is.null(this_object$`upper_bound`)) {
        self$`upper_bound` <- this_object$`upper_bound`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TargetingTemplateAudienceSizingReachEstimate in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`estimate`)) {
          sprintf(
          '"estimate":
            %d
                    ',
          self$`estimate`
          )
        },
        if (!is.null(self$`lower_bound`)) {
          sprintf(
          '"lower_bound":
            %d
                    ',
          self$`lower_bound`
          )
        },
        if (!is.null(self$`upper_bound`)) {
          sprintf(
          '"upper_bound":
            %d
                    ',
          self$`upper_bound`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingTemplateAudienceSizingReachEstimate
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingTemplateAudienceSizingReachEstimate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`estimate` <- this_object$`estimate`
      self$`lower_bound` <- this_object$`lower_bound`
      self$`upper_bound` <- this_object$`upper_bound`
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingTemplateAudienceSizingReachEstimate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingTemplateAudienceSizingReachEstimate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# TargetingTemplateAudienceSizingReachEstimate$unlock()
#
## Below is an example to define the print function
# TargetingTemplateAudienceSizingReachEstimate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingTemplateAudienceSizingReachEstimate$lock()

