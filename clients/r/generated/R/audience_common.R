#' Create a new AudienceCommon
#'
#' @description
#' AudienceCommon Class
#'
#' @docType class
#' @title AudienceCommon
#' @description AudienceCommon Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Ad account ID. character [optional]
#' @field name Audience name. character [optional]
#' @field rule  \link{AudienceRule} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceCommon <- R6::R6Class(
  "AudienceCommon",
  public = list(
    `ad_account_id` = NULL,
    `name` = NULL,
    `rule` = NULL,
    #' Initialize a new AudienceCommon class.
    #'
    #' @description
    #' Initialize a new AudienceCommon class.
    #'
    #' @param ad_account_id Ad account ID.
    #' @param name Audience name.
    #' @param rule rule
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ad_account_id` = NULL, `name` = NULL, `rule` = NULL, ...) {
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`rule`)) {
        stopifnot(R6::is.R6(`rule`))
        self$`rule` <- `rule`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceCommon in JSON format
    #' @export
    toJSON = function() {
      AudienceCommonObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AudienceCommonObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`name`)) {
        AudienceCommonObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`rule`)) {
        AudienceCommonObject[["rule"]] <-
          self$`rule`$toJSON()
      }
      AudienceCommonObject
    },
    #' Deserialize JSON string into an instance of AudienceCommon
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCommon
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`rule`)) {
        `rule_object` <- AudienceRule$new()
        `rule_object`$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
        self$`rule` <- `rule_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceCommon in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`rule`)) {
          sprintf(
          '"rule":
          %s
          ',
          jsonlite::toJSON(self$`rule`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AudienceCommon
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCommon
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`name` <- this_object$`name`
      self$`rule` <- AudienceRule$new()$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to AudienceCommon
    #'
    #' @description
    #' Validate JSON input with respect to AudienceCommon and throw an exception if invalid
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
    #' @return String representation of AudienceCommon
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
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
# AudienceCommon$unlock()
#
## Below is an example to define the print function
# AudienceCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceCommon$lock()

