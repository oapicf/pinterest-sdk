#' Create a new AudienceUpdateRequest
#'
#' @description
#' AudienceUpdateRequest Class
#'
#' @docType class
#' @title AudienceUpdateRequest
#' @description AudienceUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Ad account ID. character [optional]
#' @field name Audience name. character [optional]
#' @field rule  \link{AudienceRule} [optional]
#' @field description Audience description. character [optional]
#' @field operation_type  \link{AudienceUpdateOperationType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceUpdateRequest <- R6::R6Class(
  "AudienceUpdateRequest",
  public = list(
    `ad_account_id` = NULL,
    `name` = NULL,
    `rule` = NULL,
    `description` = NULL,
    `operation_type` = NULL,
    #' Initialize a new AudienceUpdateRequest class.
    #'
    #' @description
    #' Initialize a new AudienceUpdateRequest class.
    #'
    #' @param ad_account_id Ad account ID.
    #' @param name Audience name.
    #' @param rule rule
    #' @param description Audience description.
    #' @param operation_type operation_type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ad_account_id` = NULL, `name` = NULL, `rule` = NULL, `description` = NULL, `operation_type` = NULL, ...) {
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
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`operation_type`)) {
        if (!(`operation_type` %in% c())) {
          stop(paste("Error! \"", `operation_type`, "\" cannot be assigned to `operation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation_type`))
        self$`operation_type` <- `operation_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceUpdateRequest in JSON format
    #' @export
    toJSON = function() {
      AudienceUpdateRequestObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AudienceUpdateRequestObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`name`)) {
        AudienceUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`rule`)) {
        AudienceUpdateRequestObject[["rule"]] <-
          self$`rule`$toJSON()
      }
      if (!is.null(self$`description`)) {
        AudienceUpdateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`operation_type`)) {
        AudienceUpdateRequestObject[["operation_type"]] <-
          self$`operation_type`$toJSON()
      }
      AudienceUpdateRequestObject
    },
    #' Deserialize JSON string into an instance of AudienceUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceUpdateRequest
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
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`operation_type`)) {
        `operation_type_object` <- AudienceUpdateOperationType$new()
        `operation_type_object`$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
        self$`operation_type` <- `operation_type_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AudienceUpdateRequest in JSON format
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
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`operation_type`)) {
          sprintf(
          '"operation_type":
          %s
          ',
          jsonlite::toJSON(self$`operation_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AudienceUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AudienceUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceUpdateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`name` <- this_object$`name`
      self$`rule` <- AudienceRule$new()$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
      self$`description` <- this_object$`description`
      self$`operation_type` <- AudienceUpdateOperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to AudienceUpdateRequest
    #'
    #' @description
    #' Validate JSON input with respect to AudienceUpdateRequest and throw an exception if invalid
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
    #' @return String representation of AudienceUpdateRequest
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
# AudienceUpdateRequest$unlock()
#
## Below is an example to define the print function
# AudienceUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceUpdateRequest$lock()

