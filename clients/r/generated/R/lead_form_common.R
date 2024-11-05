#' Create a new LeadFormCommon
#'
#' @description
#' Creation fields
#'
#' @docType class
#' @title LeadFormCommon
#' @description LeadFormCommon Class
#' @format An \code{R6Class} generator object
#' @field name Internal name of the lead form. character [optional]
#' @field privacy_policy_link A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. character [optional]
#' @field has_accepted_terms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO character [optional]
#' @field completion_message A message for people who complete the form to let them know what happens next. character [optional]
#' @field status  \link{LeadFormStatus} [optional]
#' @field disclosure_language Additional disclosure language to be included in the lead form. character [optional]
#' @field questions List of questions to be displayed on the lead form. list(\link{LeadFormQuestion}) [optional]
#' @field policy_links List of additional policy links to be displayed on the lead form. list(\link{LeadFormCommonPolicyLinksInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadFormCommon <- R6::R6Class(
  "LeadFormCommon",
  public = list(
    `name` = NULL,
    `privacy_policy_link` = NULL,
    `has_accepted_terms` = NULL,
    `completion_message` = NULL,
    `status` = NULL,
    `disclosure_language` = NULL,
    `questions` = NULL,
    `policy_links` = NULL,

    #' @description
    #' Initialize a new LeadFormCommon class.
    #'
    #' @param name Internal name of the lead form.
    #' @param privacy_policy_link A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
    #' @param has_accepted_terms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
    #' @param completion_message A message for people who complete the form to let them know what happens next.
    #' @param status status
    #' @param disclosure_language Additional disclosure language to be included in the lead form.
    #' @param questions List of questions to be displayed on the lead form.
    #' @param policy_links List of additional policy links to be displayed on the lead form.
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `privacy_policy_link` = NULL, `has_accepted_terms` = NULL, `completion_message` = NULL, `status` = NULL, `disclosure_language` = NULL, `questions` = NULL, `policy_links` = NULL, ...) {
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
      if (!is.null(`policy_links`)) {
        stopifnot(is.vector(`policy_links`), length(`policy_links`) != 0)
        sapply(`policy_links`, function(x) stopifnot(R6::is.R6(x)))
        self$`policy_links` <- `policy_links`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormCommon in JSON format
    toJSON = function() {
      LeadFormCommonObject <- list()
      if (!is.null(self$`name`)) {
        LeadFormCommonObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`privacy_policy_link`)) {
        LeadFormCommonObject[["privacy_policy_link"]] <-
          self$`privacy_policy_link`
      }
      if (!is.null(self$`has_accepted_terms`)) {
        LeadFormCommonObject[["has_accepted_terms"]] <-
          self$`has_accepted_terms`
      }
      if (!is.null(self$`completion_message`)) {
        LeadFormCommonObject[["completion_message"]] <-
          self$`completion_message`
      }
      if (!is.null(self$`status`)) {
        LeadFormCommonObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`disclosure_language`)) {
        LeadFormCommonObject[["disclosure_language"]] <-
          self$`disclosure_language`
      }
      if (!is.null(self$`questions`)) {
        LeadFormCommonObject[["questions"]] <-
          lapply(self$`questions`, function(x) x$toJSON())
      }
      if (!is.null(self$`policy_links`)) {
        LeadFormCommonObject[["policy_links"]] <-
          lapply(self$`policy_links`, function(x) x$toJSON())
      }
      LeadFormCommonObject
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormCommon
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
      if (!is.null(this_object$`policy_links`)) {
        self$`policy_links` <- ApiClient$new()$deserializeObj(this_object$`policy_links`, "array[LeadFormCommonPolicyLinksInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadFormCommon in JSON format
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
        if (!is.null(self$`policy_links`)) {
          sprintf(
          '"policy_links":
          [%s]
',
          paste(sapply(self$`policy_links`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadFormCommon
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadFormCommon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`privacy_policy_link` <- this_object$`privacy_policy_link`
      self$`has_accepted_terms` <- this_object$`has_accepted_terms`
      self$`completion_message` <- this_object$`completion_message`
      self$`status` <- LeadFormStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`disclosure_language` <- this_object$`disclosure_language`
      self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[LeadFormQuestion]", loadNamespace("openapi"))
      self$`policy_links` <- ApiClient$new()$deserializeObj(this_object$`policy_links`, "array[LeadFormCommonPolicyLinksInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadFormCommon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadFormCommon
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`questions`) > 10) {
        return(FALSE)
      }
      if (length(self$`questions`) < 0) {
        return(FALSE)
      }

      if (length(self$`policy_links`) > 3) {
        return(FALSE)
      }
      if (length(self$`policy_links`) < 0) {
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
      if (length(self$`questions`) > 10) {
        invalid_fields["questions"] <- "Invalid length for `questions`, number of items must be less than or equal to 10."
      }
      if (length(self$`questions`) < 0) {
        invalid_fields["questions"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
      }

      if (length(self$`policy_links`) > 3) {
        invalid_fields["policy_links"] <- "Invalid length for `policy_links`, number of items must be less than or equal to 3."
      }
      if (length(self$`policy_links`) < 0) {
        invalid_fields["policy_links"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
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
# LeadFormCommon$unlock()
#
## Below is an example to define the print function
# LeadFormCommon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadFormCommon$lock()

