#' Create a new AudienceCreateRequest
#'
#' @description
#' AudienceCreateRequest Class
#'
#' @docType class
#' @title AudienceCreateRequest
#' @description AudienceCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Ad account ID. character [optional]
#' @field name Audience name. character
#' @field rule  \link{AudienceRule}
#' @field description Audience description. character [optional]
#' @field audience_type  \link{AudienceCreateRequest1AudienceType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceCreateRequest <- R6::R6Class(
  "AudienceCreateRequest",
  public = list(
    `ad_account_id` = NULL,
    `name` = NULL,
    `rule` = NULL,
    `description` = NULL,
    `audience_type` = NULL,

    #' @description
    #' Initialize a new AudienceCreateRequest class.
    #'
    #' @param name Audience name.
    #' @param rule rule
    #' @param audience_type audience_type
    #' @param ad_account_id Ad account ID.
    #' @param description Audience description.
    #' @param ... Other optional arguments.
    initialize = function(`name`, `rule`, `audience_type`, `ad_account_id` = NULL, `description` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`rule`)) {
        stopifnot(R6::is.R6(`rule`))
        self$`rule` <- `rule`
      }
      if (!missing(`audience_type`)) {
        stopifnot(R6::is.R6(`audience_type`))
        self$`audience_type` <- `audience_type`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateRequest in JSON format
    toJSON = function() {
      AudienceCreateRequestObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AudienceCreateRequestObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`name`)) {
        AudienceCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`rule`)) {
        AudienceCreateRequestObject[["rule"]] <-
          self$`rule`$toJSON()
      }
      if (!is.null(self$`description`)) {
        AudienceCreateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`audience_type`)) {
        AudienceCreateRequestObject[["audience_type"]] <-
          self$`audience_type`$toJSON()
      }
      AudienceCreateRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateRequest
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
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`audience_type`)) {
        `audience_type_object` <- AudienceCreateRequest1AudienceType$new()
        `audience_type_object`$fromJSON(jsonlite::toJSON(this_object$`audience_type`, auto_unbox = TRUE, digits = NA))
        self$`audience_type` <- `audience_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateRequest in JSON format
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
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`audience_type`)) {
          sprintf(
          '"audience_type":
          %s
          ',
          jsonlite::toJSON(self$`audience_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`name` <- this_object$`name`
      self$`rule` <- AudienceRule$new()$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
      self$`description` <- this_object$`description`
      self$`audience_type` <- AudienceCreateRequest1AudienceType$new()$fromJSON(jsonlite::toJSON(this_object$`audience_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AudienceCreateRequest: the required field `name` is missing."))
      }
      # check the required field `rule`
      if (!is.null(input_json$`rule`)) {
        stopifnot(R6::is.R6(input_json$`rule`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AudienceCreateRequest: the required field `rule` is missing."))
      }
      # check the required field `audience_type`
      if (!is.null(input_json$`audience_type`)) {
        stopifnot(R6::is.R6(input_json$`audience_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AudienceCreateRequest: the required field `audience_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `rule` is null
      if (is.null(self$`rule`)) {
        return(FALSE)
      }

      # check if the required `audience_type` is null
      if (is.null(self$`audience_type`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `rule` is null
      if (is.null(self$`rule`)) {
        invalid_fields["rule"] <- "Non-nullable required field `rule` cannot be null."
      }

      # check if the required `audience_type` is null
      if (is.null(self$`audience_type`)) {
        invalid_fields["audience_type"] <- "Non-nullable required field `audience_type` cannot be null."
      }

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
# AudienceCreateRequest$unlock()
#
## Below is an example to define the print function
# AudienceCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceCreateRequest$lock()

