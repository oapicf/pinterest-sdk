#' Create a new LeadForm
#'
#' @description
#' LeadForm Class
#'
#' @docType class
#' @title LeadForm
#' @description LeadForm Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id The Ad Account ID that this lead form belongs to. character [optional]
#' @field completion_message A message for people who complete the form to let them know what happens next. character
#' @field created_time Lead form creation time. Unix timestamp in seconds. integer [optional]
#' @field disclosure_language Additional disclosure language to be included in the lead form. character [optional]
#' @field has_accepted_terms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO character
#' @field id The ID of this lead form character
#' @field name Internal name of the lead form. character
#' @field policy_links List of additional policy links to be displayed on the lead form. list(\link{LeadFormPolicyLink}) [optional]
#' @field privacy_policy_link A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. character
#' @field questions List of questions to be displayed on the lead form. list(\link{LeadFormQuestion})
#' @field status  \link{LeadFormStatus} [optional]
#' @field updated_time Last update time. Unix timestamp in seconds. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadForm <- R6::R6Class(
  "LeadForm",
  public = list(
    `ad_account_id` = NULL,
    `completion_message` = NULL,
    `created_time` = NULL,
    `disclosure_language` = NULL,
    `has_accepted_terms` = NULL,
    `id` = NULL,
    `name` = NULL,
    `policy_links` = NULL,
    `privacy_policy_link` = NULL,
    `questions` = NULL,
    `status` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new LeadForm class.
    #'
    #' @param completion_message A message for people who complete the form to let them know what happens next.
    #' @param has_accepted_terms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
    #' @param id The ID of this lead form
    #' @param name Internal name of the lead form.
    #' @param privacy_policy_link A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
    #' @param questions List of questions to be displayed on the lead form.
    #' @param ad_account_id The Ad Account ID that this lead form belongs to.
    #' @param created_time Lead form creation time. Unix timestamp in seconds.
    #' @param disclosure_language Additional disclosure language to be included in the lead form.
    #' @param policy_links List of additional policy links to be displayed on the lead form.
    #' @param status status
    #' @param updated_time Last update time. Unix timestamp in seconds.
    #' @param ... Other optional arguments.
    initialize = function(`completion_message`, `has_accepted_terms`, `id`, `name`, `privacy_policy_link`, `questions`, `ad_account_id` = NULL, `created_time` = NULL, `disclosure_language` = NULL, `policy_links` = NULL, `status` = NULL, `updated_time` = NULL, ...) {
      if (!missing(`completion_message`)) {
        if (!(is.character(`completion_message`) && length(`completion_message`) == 1)) {
          stop(paste("Error! Invalid data for `completion_message`. Must be a string:", `completion_message`))
        }
        self$`completion_message` <- `completion_message`
      }
      if (!missing(`has_accepted_terms`)) {
        if (!(is.logical(`has_accepted_terms`) && length(`has_accepted_terms`) == 1)) {
          stop(paste("Error! Invalid data for `has_accepted_terms`. Must be a boolean:", `has_accepted_terms`))
        }
        self$`has_accepted_terms` <- `has_accepted_terms`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`privacy_policy_link`)) {
        if (!(is.character(`privacy_policy_link`) && length(`privacy_policy_link`) == 1)) {
          stop(paste("Error! Invalid data for `privacy_policy_link`. Must be a string:", `privacy_policy_link`))
        }
        self$`privacy_policy_link` <- `privacy_policy_link`
      }
      if (!missing(`questions`)) {
        stopifnot(is.vector(`questions`), length(`questions`) != 0)
        sapply(`questions`, function(x) stopifnot(R6::is.R6(x)))
        self$`questions` <- `questions`
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
      if (!is.null(`disclosure_language`)) {
        if (!(is.character(`disclosure_language`) && length(`disclosure_language`) == 1)) {
          stop(paste("Error! Invalid data for `disclosure_language`. Must be a string:", `disclosure_language`))
        }
        self$`disclosure_language` <- `disclosure_language`
      }
      if (!is.null(`policy_links`)) {
        stopifnot(is.vector(`policy_links`), length(`policy_links`) != 0)
        sapply(`policy_links`, function(x) stopifnot(R6::is.R6(x)))
        self$`policy_links` <- `policy_links`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return LeadForm as a base R list.
    #' @examples
    #' # convert array of LeadForm (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert LeadForm to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadFormObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        LeadFormObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`completion_message`)) {
        LeadFormObject[["completion_message"]] <-
          self$`completion_message`
      }
      if (!is.null(self$`created_time`)) {
        LeadFormObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`disclosure_language`)) {
        LeadFormObject[["disclosure_language"]] <-
          self$`disclosure_language`
      }
      if (!is.null(self$`has_accepted_terms`)) {
        LeadFormObject[["has_accepted_terms"]] <-
          self$`has_accepted_terms`
      }
      if (!is.null(self$`id`)) {
        LeadFormObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        LeadFormObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`policy_links`)) {
        LeadFormObject[["policy_links"]] <-
          self$extractSimpleType(self$`policy_links`)
      }
      if (!is.null(self$`privacy_policy_link`)) {
        LeadFormObject[["privacy_policy_link"]] <-
          self$`privacy_policy_link`
      }
      if (!is.null(self$`questions`)) {
        LeadFormObject[["questions"]] <-
          self$extractSimpleType(self$`questions`)
      }
      if (!is.null(self$`status`)) {
        LeadFormObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`updated_time`)) {
        LeadFormObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(LeadFormObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadForm
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadForm
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`completion_message`)) {
        self$`completion_message` <- this_object$`completion_message`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`disclosure_language`)) {
        self$`disclosure_language` <- this_object$`disclosure_language`
      }
      if (!is.null(this_object$`has_accepted_terms`)) {
        self$`has_accepted_terms` <- this_object$`has_accepted_terms`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`policy_links`)) {
        self$`policy_links` <- ApiClient$new()$deserializeObj(this_object$`policy_links`, "array[LeadFormPolicyLink]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`privacy_policy_link`)) {
        self$`privacy_policy_link` <- this_object$`privacy_policy_link`
      }
      if (!is.null(this_object$`questions`)) {
        self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[LeadFormQuestion]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- LeadFormStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadForm in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadForm
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadForm
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`completion_message` <- this_object$`completion_message`
      self$`created_time` <- this_object$`created_time`
      self$`disclosure_language` <- this_object$`disclosure_language`
      self$`has_accepted_terms` <- this_object$`has_accepted_terms`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`policy_links` <- ApiClient$new()$deserializeObj(this_object$`policy_links`, "array[LeadFormPolicyLink]", loadNamespace("openapi"))
      self$`privacy_policy_link` <- this_object$`privacy_policy_link`
      self$`questions` <- ApiClient$new()$deserializeObj(this_object$`questions`, "array[LeadFormQuestion]", loadNamespace("openapi"))
      self$`status` <- LeadFormStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadForm and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `completion_message`
      if (!is.null(input_json$`completion_message`)) {
        if (!(is.character(input_json$`completion_message`) && length(input_json$`completion_message`) == 1)) {
          stop(paste("Error! Invalid data for `completion_message`. Must be a string:", input_json$`completion_message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadForm: the required field `completion_message` is missing."))
      }
      # check the required field `has_accepted_terms`
      if (!is.null(input_json$`has_accepted_terms`)) {
        if (!(is.logical(input_json$`has_accepted_terms`) && length(input_json$`has_accepted_terms`) == 1)) {
          stop(paste("Error! Invalid data for `has_accepted_terms`. Must be a boolean:", input_json$`has_accepted_terms`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadForm: the required field `has_accepted_terms` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadForm: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadForm: the required field `name` is missing."))
      }
      # check the required field `privacy_policy_link`
      if (!is.null(input_json$`privacy_policy_link`)) {
        if (!(is.character(input_json$`privacy_policy_link`) && length(input_json$`privacy_policy_link`) == 1)) {
          stop(paste("Error! Invalid data for `privacy_policy_link`. Must be a string:", input_json$`privacy_policy_link`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadForm: the required field `privacy_policy_link` is missing."))
      }
      # check the required field `questions`
      if (!is.null(input_json$`questions`)) {
        stopifnot(is.vector(input_json$`questions`), length(input_json$`questions`) != 0)
        tmp <- sapply(input_json$`questions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadForm: the required field `questions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadForm
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

      # check if the required `has_accepted_terms` is null
      if (is.null(self$`has_accepted_terms`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (length(self$`policy_links`) > 3) {
        return(FALSE)
      }
      if (length(self$`policy_links`) < 0) {
        return(FALSE)
      }

      # check if the required `questions` is null
      if (is.null(self$`questions`)) {
        return(FALSE)
      }

      if (length(self$`questions`) > 10) {
        return(FALSE)
      }
      if (length(self$`questions`) < 0) {
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

      # check if the required `has_accepted_terms` is null
      if (is.null(self$`has_accepted_terms`)) {
        invalid_fields["has_accepted_terms"] <- "Non-nullable required field `has_accepted_terms` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (length(self$`policy_links`) > 3) {
        invalid_fields["policy_links"] <- "Invalid length for `policy_links`, number of items must be less than or equal to 3."
      }
      if (length(self$`policy_links`) < 0) {
        invalid_fields["policy_links"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
      }

      # check if the required `questions` is null
      if (is.null(self$`questions`)) {
        invalid_fields["questions"] <- "Non-nullable required field `questions` cannot be null."
      }

      if (length(self$`questions`) > 10) {
        invalid_fields["questions"] <- "Invalid length for `questions`, number of items must be less than or equal to 10."
      }
      if (length(self$`questions`) < 0) {
        invalid_fields["questions"] <- "Invalid length for ``, number of items must be greater than or equal to 0."
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
# LeadForm$unlock()
#
## Below is an example to define the print function
# LeadForm$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadForm$lock()

