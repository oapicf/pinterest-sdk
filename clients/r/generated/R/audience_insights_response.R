#' Create a new AudienceInsightsResponse
#'
#' @description
#' Audience interests and demographics.
#'
#' @docType class
#' @title AudienceInsightsResponse
#' @description AudienceInsightsResponse Class
#' @format An \code{R6Class} generator object
#' @field categories Category interest distribution list(\link{AudienceCategory}) [optional]
#' @field demographics  \link{AudienceDemographics} [optional]
#' @field type  \link{AudienceInsightType} [optional]
#' @field date Generation date character [optional]
#' @field size Population count. integer [optional]
#' @field size_is_upper_bound Indicates whether the audience size has been rounded up to the next highest upper boundary. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceInsightsResponse <- R6::R6Class(
  "AudienceInsightsResponse",
  public = list(
    `categories` = NULL,
    `demographics` = NULL,
    `type` = NULL,
    `date` = NULL,
    `size` = NULL,
    `size_is_upper_bound` = NULL,
    #' Initialize a new AudienceInsightsResponse class.
    #'
    #' @description
    #' Initialize a new AudienceInsightsResponse class.
    #'
    #' @param categories Category interest distribution
    #' @param demographics demographics
    #' @param type type
    #' @param date Generation date
    #' @param size Population count.
    #' @param size_is_upper_bound Indicates whether the audience size has been rounded up to the next highest upper boundary.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`categories` = NULL, `demographics` = NULL, `type` = NULL, `date` = NULL, `size` = NULL, `size_is_upper_bound` = NULL, ...) {
      if (!is.null(`categories`)) {
        stopifnot(is.vector(`categories`), length(`categories`) != 0)
        sapply(`categories`, function(x) stopifnot(R6::is.R6(x)))
        self$`categories` <- `categories`
      }
      if (!is.null(`demographics`)) {
        stopifnot(R6::is.R6(`demographics`))
        self$`demographics` <- `demographics`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`date`)) {
        if (!(is.character(`date`) && length(`date`) == 1)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
      if (!is.null(`size`)) {
        if (!(is.numeric(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", `size`))
        }
        self$`size` <- `size`
      }
      if (!is.null(`size_is_upper_bound`)) {
        if (!(is.logical(`size_is_upper_bound`) && length(`size_is_upper_bound`) == 1)) {
          stop(paste("Error! Invalid data for `size_is_upper_bound`. Must be a boolean:", `size_is_upper_bound`))
        }
        self$`size_is_upper_bound` <- `size_is_upper_bound`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceInsightsResponse in JSON format
    #' @export
    toJSON = function() {
      AudienceInsightsResponseObject <- list()
      if (!is.null(self$`categories`)) {
        AudienceInsightsResponseObject[["categories"]] <-
          lapply(self$`categories`, function(x) x$toJSON())
      }
      if (!is.null(self$`demographics`)) {
        AudienceInsightsResponseObject[["demographics"]] <-
          self$`demographics`$toJSON()
      }
      if (!is.null(self$`type`)) {
        AudienceInsightsResponseObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`date`)) {
        AudienceInsightsResponseObject[["date"]] <-
          self$`date`
      }
      if (!is.null(self$`size`)) {
        AudienceInsightsResponseObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`size_is_upper_bound`)) {
        AudienceInsightsResponseObject[["size_is_upper_bound"]] <-
          self$`size_is_upper_bound`
      }
      AudienceInsightsResponseObject
    },
    #' Deserialize JSON string into an instance of AudienceInsightsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceInsightsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceInsightsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`categories`)) {
        self$`categories` <- ApiClient$new()$deserializeObj(this_object$`categories`, "array[AudienceCategory]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`demographics`)) {
        `demographics_object` <- AudienceDemographics$new()
        `demographics_object`$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
        self$`demographics` <- `demographics_object`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- AudienceInsightType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`size_is_upper_bound`)) {
        self$`size_is_upper_bound` <- this_object$`size_is_upper_bound`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceInsightsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`categories`)) {
          sprintf(
          '"categories":
          [%s]
',
          paste(sapply(self$`categories`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`demographics`)) {
          sprintf(
          '"demographics":
          %s
          ',
          jsonlite::toJSON(self$`demographics`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`date`)) {
          sprintf(
          '"date":
            "%s"
                    ',
          self$`date`
          )
        },
        if (!is.null(self$`size`)) {
          sprintf(
          '"size":
            %d
                    ',
          self$`size`
          )
        },
        if (!is.null(self$`size_is_upper_bound`)) {
          sprintf(
          '"size_is_upper_bound":
            %s
                    ',
          tolower(self$`size_is_upper_bound`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AudienceInsightsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceInsightsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceInsightsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`categories` <- ApiClient$new()$deserializeObj(this_object$`categories`, "array[AudienceCategory]", loadNamespace("openapi"))
      self$`demographics` <- AudienceDemographics$new()$fromJSON(jsonlite::toJSON(this_object$`demographics`, auto_unbox = TRUE, digits = NA))
      self$`type` <- AudienceInsightType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`date` <- this_object$`date`
      self$`size` <- this_object$`size`
      self$`size_is_upper_bound` <- this_object$`size_is_upper_bound`
      self
    },
    #' Validate JSON input with respect to AudienceInsightsResponse
    #'
    #' @description
    #' Validate JSON input with respect to AudienceInsightsResponse and throw an exception if invalid
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
    #' @return String representation of AudienceInsightsResponse
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
      if (!str_detect(self$`date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        return(FALSE)
      }

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
      if (!str_detect(self$`date`, "^\\d{4}-\\d{2}-\\d{2}$")) {
        invalid_fields["date"] <- "Invalid value for `date`, must conform to the pattern ^\\d{4}-\\d{2}-\\d{2}$."
      }

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
# AudienceInsightsResponse$unlock()
#
## Below is an example to define the print function
# AudienceInsightsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceInsightsResponse$lock()

