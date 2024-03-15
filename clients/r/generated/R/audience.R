#' Create a new Audience
#'
#' @description
#' Audience Class
#'
#' @docType class
#' @title Audience
#' @description Audience Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Ad account ID. character [optional]
#' @field id Audience ID. character [optional]
#' @field name Audience name. character [optional]
#' @field audience_type <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR character [optional]
#' @field description Audience description. character [optional]
#' @field rule  \link{AudienceRule} [optional]
#' @field size Audience size. integer [optional]
#' @field status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. character [optional]
#' @field type Always \"audience\". character [optional]
#' @field created_timestamp Creation time. Unix timestamp in seconds. integer [optional]
#' @field updated_timestamp Last update time. Unix timestamp in seconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Audience <- R6::R6Class(
  "Audience",
  public = list(
    `ad_account_id` = NULL,
    `id` = NULL,
    `name` = NULL,
    `audience_type` = NULL,
    `description` = NULL,
    `rule` = NULL,
    `size` = NULL,
    `status` = NULL,
    `type` = NULL,
    `created_timestamp` = NULL,
    `updated_timestamp` = NULL,
    #' Initialize a new Audience class.
    #'
    #' @description
    #' Initialize a new Audience class.
    #'
    #' @param ad_account_id Ad account ID.
    #' @param id Audience ID.
    #' @param name Audience name.
    #' @param audience_type <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
    #' @param description Audience description.
    #' @param rule rule
    #' @param size Audience size.
    #' @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
    #' @param type Always \"audience\".
    #' @param created_timestamp Creation time. Unix timestamp in seconds.
    #' @param updated_timestamp Last update time. Unix timestamp in seconds.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ad_account_id` = NULL, `id` = NULL, `name` = NULL, `audience_type` = NULL, `description` = NULL, `rule` = NULL, `size` = NULL, `status` = NULL, `type` = NULL, `created_timestamp` = NULL, `updated_timestamp` = NULL, ...) {
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`audience_type`)) {
        if (!(is.character(`audience_type`) && length(`audience_type`) == 1)) {
          stop(paste("Error! Invalid data for `audience_type`. Must be a string:", `audience_type`))
        }
        self$`audience_type` <- `audience_type`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`rule`)) {
        stopifnot(R6::is.R6(`rule`))
        self$`rule` <- `rule`
      }
      if (!is.null(`size`)) {
        if (!(is.numeric(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", `size`))
        }
        self$`size` <- `size`
      }
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`created_timestamp`)) {
        if (!(is.numeric(`created_timestamp`) && length(`created_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `created_timestamp`. Must be an integer:", `created_timestamp`))
        }
        self$`created_timestamp` <- `created_timestamp`
      }
      if (!is.null(`updated_timestamp`)) {
        if (!(is.numeric(`updated_timestamp`) && length(`updated_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `updated_timestamp`. Must be an integer:", `updated_timestamp`))
        }
        self$`updated_timestamp` <- `updated_timestamp`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Audience in JSON format
    #' @export
    toJSON = function() {
      AudienceObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AudienceObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`id`)) {
        AudienceObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        AudienceObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`audience_type`)) {
        AudienceObject[["audience_type"]] <-
          self$`audience_type`
      }
      if (!is.null(self$`description`)) {
        AudienceObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`rule`)) {
        AudienceObject[["rule"]] <-
          self$`rule`$toJSON()
      }
      if (!is.null(self$`size`)) {
        AudienceObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`status`)) {
        AudienceObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`type`)) {
        AudienceObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`created_timestamp`)) {
        AudienceObject[["created_timestamp"]] <-
          self$`created_timestamp`
      }
      if (!is.null(self$`updated_timestamp`)) {
        AudienceObject[["updated_timestamp"]] <-
          self$`updated_timestamp`
      }
      AudienceObject
    },
    #' Deserialize JSON string into an instance of Audience
    #'
    #' @description
    #' Deserialize JSON string into an instance of Audience
    #'
    #' @param input_json the JSON input
    #' @return the instance of Audience
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`audience_type`)) {
        self$`audience_type` <- this_object$`audience_type`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`rule`)) {
        `rule_object` <- AudienceRule$new()
        `rule_object`$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
        self$`rule` <- `rule_object`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`created_timestamp`)) {
        self$`created_timestamp` <- this_object$`created_timestamp`
      }
      if (!is.null(this_object$`updated_timestamp`)) {
        self$`updated_timestamp` <- this_object$`updated_timestamp`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Audience in JSON format
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
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
        if (!is.null(self$`audience_type`)) {
          sprintf(
          '"audience_type":
            "%s"
                    ',
          self$`audience_type`
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
        if (!is.null(self$`rule`)) {
          sprintf(
          '"rule":
          %s
          ',
          jsonlite::toJSON(self$`rule`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`created_timestamp`)) {
          sprintf(
          '"created_timestamp":
            %d
                    ',
          self$`created_timestamp`
          )
        },
        if (!is.null(self$`updated_timestamp`)) {
          sprintf(
          '"updated_timestamp":
            %d
                    ',
          self$`updated_timestamp`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Audience
    #'
    #' @description
    #' Deserialize JSON string into an instance of Audience
    #'
    #' @param input_json the JSON input
    #' @return the instance of Audience
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`audience_type` <- this_object$`audience_type`
      self$`description` <- this_object$`description`
      self$`rule` <- AudienceRule$new()$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
      self$`size` <- this_object$`size`
      self$`status` <- this_object$`status`
      self$`type` <- this_object$`type`
      self$`created_timestamp` <- this_object$`created_timestamp`
      self$`updated_timestamp` <- this_object$`updated_timestamp`
      self
    },
    #' Validate JSON input with respect to Audience
    #'
    #' @description
    #' Validate JSON input with respect to Audience and throw an exception if invalid
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
    #' @return String representation of Audience
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

      if (!str_detect(self$`id`, "^\\d+$")) {
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

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# Audience$unlock()
#
## Below is an example to define the print function
# Audience$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Audience$lock()

