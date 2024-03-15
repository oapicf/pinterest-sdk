#' Create a new LeadFormResponse
#'
#' @description
#' LeadFormResponse Class
#'
#' @docType class
#' @title LeadFormResponse
#' @description LeadFormResponse Class
#' @format An \code{R6Class} generator object
#' @field name Internal name of the lead form. character [optional]
#' @field privacy_policy_link A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. character [optional]
#' @field has_accepted_terms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. character [optional]
#' @field completion_message A message for people who complete the form to let them know what happens next. character [optional]
#' @field status  \link{LeadFormStatus} [optional]
#' @field disclosure_language Additional disclosure language to be included in the lead form. character [optional]
#' @field questions List of questions to be displayed on the lead form. list(\link{LeadFormQuestion}) [optional]
#' @field id The ID of this lead form character [optional]
#' @field ad_account_id The Ad Account ID that this lead form belongs to. character [optional]
#' @field created_time Lead form creation time. Unix timestamp in seconds. integer [optional]
#' @field updated_time Last update time. Unix timestamp in seconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormResponse <- R6::R6Class(
  "LeadFormResponse",
  public = list(
    `name` = NULL,
    `privacy_policy_link` = NULL,
    `has_accepted_terms` = NULL,
    `completion_message` = NULL,
    `status` = NULL,
    `disclosure_language` = NULL,
    `questions` = NULL,
    `id` = NULL,
    `ad_account_id` = NULL,
    `created_time` = NULL,
    `updated_time` = NULL,
    #' Initialize a new LeadFormResponse class.
    #'
    #' @description
    #' Initialize a new LeadFormResponse class.
    #'
    #' @param name Internal name of the lead form.
    #' @param privacy_policy_link A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
    #' @param has_accepted_terms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
    #' @param completion_message A message for people who complete the form to let them know what happens next.
    #' @param status status
    #' @param disclosure_language Additional disclosure language to be included in the lead form.
    #' @param questions List of questions to be displayed on the lead form.
    #' @param id The ID of this lead form
    #' @param ad_account_id The Ad Account ID that this lead form belongs to.
    #' @param created_time Lead form creation time. Unix timestamp in seconds.
    #' @param updated_time Last update time. Unix timestamp in seconds.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `privacy_policy_link` = NULL, `has_accepted_terms` = NULL, `completion_message` = NULL, `status` = NULL, `disclosure_language` = NULL, `questions` = NULL, `id` = NULL, `ad_account_id` = NULL, `created_time` = NULL, `updated_time` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`privacy_policy_link`)) {
        if (!(is.character(`privacy_policy_link`) && length(`privacy_policy_link`) == 1)) {
          stop(paste("Error! Invalid data for `privacy_policy_link`. Must be a string:", `privacy_policy_link`))
        }
        self$`privacy_policy_link` <- `privacy_policy_link`
      }
      if (!is.null(`has_accepted_terms`)) {
        if (!(is.logical(`has_accepted_terms`) && length(`has_accepted_terms`) == 1)) {
          stop(paste("Error! Invalid data for `has_accepted_terms`. Must be a boolean:", `has_accepted_terms`))
        }
        self$`has_accepted_terms` <- `has_accepted_terms`
      }
      if (!is.null(`completion_message`)) {
        if (!(is.character(`completion_message`) && length(`completion_message`) == 1)) {
          stop(paste("Error! Invalid data for `completion_message`. Must be a string:", `completion_message`))
        }
        self$`completion_message` <- `completion_message`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`disclosure_language`)) {
        if (!(is.character(`disclosure_language`) && length(`disclosure_language`) == 1)) {
          stop(paste("Error! Invalid data for `disclosure_language`. Must be a string:", `disclosure_language`))
        }
        self$`disclosure_language` <- `disclosure_language`
      }
      if (!is.null(`questions`)) {
        stopifnot(is.vector(`questions`), length(`questions`) != 0)
        sapply(`questions`, function(x) stopifnot(R6::is.R6(x)))
        self$`questions` <- `questions`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LeadFormResponse in JSON format
    #' @export
    toJSON = function() {
      LeadFormResponseObject <- list()
      if (!is.null(self$`name`)) {
        LeadFormResponseObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`privacy_policy_link`)) {
        LeadFormResponseObject[["privacy_policy_link"]] <-
          self$`privacy_policy_link`
      }
      if (!is.null(self$`has_accepted_terms`)) {
        LeadFormResponseObject[["has_accepted_terms"]] <-
          self$`has_accepted_terms`
      }
      if (!is.null(self$`completion_message`)) {
        LeadFormResponseObject[["completion_message"]] <-
          self$`completion_message`
      }
      if (!is.null(self$`status`)) {
        LeadFormResponseObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`disclosure_language`)) {
        LeadFormResponseObject[["disclosure_language"]] <-
          self$`disclosure_language`
      }
      if (!is.null(self$`questions`)) {
        LeadFormResponseObject[["questions"]] <-
          lapply(self$`questions`, function(x) x$toJSON())
      }
      if (!is.null(self$`id`)) {
        LeadFormResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ad_account_id`)) {
        LeadFormResponseObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`created_time`)) {
        LeadFormResponseObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`updated_time`)) {
        LeadFormResponseObject[["updated_time"]] <-
          self$`updated_time`
      }
      LeadFormResponseObject
    },
    #' Deserialize JSON string into an instance of LeadFormResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`privacy_policy_link`)) {
        self$`privacy_policy_link` <- this_object$`privacy_policy_link`
      }
      if (!is.null(this_object$`has_accepted_terms`)) {
        self$`has_accepted_terms` <- this_object$`has_accepted_terms`
      }
      if (!is.null(this_object$`completion_message`)) {
        self$`completion_message` <- this_object$`completion_message`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- LeadFormStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`disclosure_language`)) {
        self$`disclosure_language` <- this_object$`disclosure_language`
      }
      if (!is.null(this_object$`questions`)) {
        self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[LeadFormQuestion]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LeadFormResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`privacy_policy_link`)) {
          sprintf(
          '"privacy_policy_link":
            "%s"
                    ',
          self$`privacy_policy_link`
          )
        },
        if (!is.null(self$`has_accepted_terms`)) {
          sprintf(
          '"has_accepted_terms":
            %s
                    ',
          tolower(self$`has_accepted_terms`)
          )
        },
        if (!is.null(self$`completion_message`)) {
          sprintf(
          '"completion_message":
            "%s"
                    ',
          self$`completion_message`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`disclosure_language`)) {
          sprintf(
          '"disclosure_language":
            "%s"
                    ',
          self$`disclosure_language`
          )
        },
        if (!is.null(self$`questions`)) {
          sprintf(
          '"questions":
          [%s]
',
          paste(sapply(self$`questions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`created_time`)) {
          sprintf(
          '"created_time":
            %d
                    ',
          self$`created_time`
          )
        },
        if (!is.null(self$`updated_time`)) {
          sprintf(
          '"updated_time":
            %d
                    ',
          self$`updated_time`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of LeadFormResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of LeadFormResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`privacy_policy_link` <- this_object$`privacy_policy_link`
      self$`has_accepted_terms` <- this_object$`has_accepted_terms`
      self$`completion_message` <- this_object$`completion_message`
      self$`status` <- LeadFormStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`disclosure_language` <- this_object$`disclosure_language`
      self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[LeadFormQuestion]", loadNamespace("openapi"))
      self$`id` <- this_object$`id`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`created_time` <- this_object$`created_time`
      self$`updated_time` <- this_object$`updated_time`
      self
    },
    #' Validate JSON input with respect to LeadFormResponse
    #'
    #' @description
    #' Validate JSON input with respect to LeadFormResponse and throw an exception if invalid
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
    #' @return String representation of LeadFormResponse
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
      if (length(self$`questions`) > 10) {
        return(FALSE)
      }
      if (length(self$`questions`) < 0) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

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
      if (length(self$`questions`) > 10) {
        invalid_fields["questions"] <- "Invalid length for `questions`, number of items must be less than or equal to 10."
      }
      if (length(self$`questions`) < 0) {
        invalid_fields["questions"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

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
# LeadFormResponse$unlock()
#
## Below is an example to define the print function
# LeadFormResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormResponse$lock()

