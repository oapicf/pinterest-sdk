#' Create a new UserBusinessRoleBinding
#'
#' @description
#' UserBusinessRoleBinding Class
#'
#' @docType class
#' @title UserBusinessRoleBinding
#' @description UserBusinessRoleBinding Class
#' @format An \code{R6Class} generator object
#' @field assets_summary  \link{BusinessMemberAssetsSummary} [optional]
#' @field business_roles The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. list(character) [optional]
#' @field created_by_business Metadata for the business that created the business relationship. \link{BusinessAccessUserSummary} [optional]
#' @field created_by_user Metadata for the user that created the business relationship. \link{BusinessAccessUserSummary} [optional]
#' @field created_time The time the business relationship was created. Returned in milliseconds. integer [optional]
#' @field id Unique identifier of the business member/business partner/employer. character [optional]
#' @field is_shared_partner This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. character [optional]
#' @field user Metadata for the business member/business partner/employer. \link{BusinessAccessUserSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserBusinessRoleBinding <- R6::R6Class(
  "UserBusinessRoleBinding",
  public = list(
    `assets_summary` = NULL,
    `business_roles` = NULL,
    `created_by_business` = NULL,
    `created_by_user` = NULL,
    `created_time` = NULL,
    `id` = NULL,
    `is_shared_partner` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new UserBusinessRoleBinding class.
    #'
    #' @param assets_summary assets_summary
    #' @param business_roles The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
    #' @param created_by_business Metadata for the business that created the business relationship.
    #' @param created_by_user Metadata for the user that created the business relationship.
    #' @param created_time The time the business relationship was created. Returned in milliseconds.
    #' @param id Unique identifier of the business member/business partner/employer.
    #' @param is_shared_partner This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
    #' @param user Metadata for the business member/business partner/employer.
    #' @param ... Other optional arguments.
    initialize = function(`assets_summary` = NULL, `business_roles` = NULL, `created_by_business` = NULL, `created_by_user` = NULL, `created_time` = NULL, `id` = NULL, `is_shared_partner` = NULL, `user` = NULL, ...) {
      if (!is.null(`assets_summary`)) {
        stopifnot(R6::is.R6(`assets_summary`))
        self$`assets_summary` <- `assets_summary`
      }
      if (!is.null(`business_roles`)) {
        stopifnot(is.vector(`business_roles`), length(`business_roles`) != 0)
        sapply(`business_roles`, function(x) stopifnot(is.character(x)))
        self$`business_roles` <- `business_roles`
      }
      if (!is.null(`created_by_business`)) {
        stopifnot(R6::is.R6(`created_by_business`))
        self$`created_by_business` <- `created_by_business`
      }
      if (!is.null(`created_by_user`)) {
        stopifnot(R6::is.R6(`created_by_user`))
        self$`created_by_user` <- `created_by_user`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`is_shared_partner`)) {
        if (!(is.logical(`is_shared_partner`) && length(`is_shared_partner`) == 1)) {
          stop(paste("Error! Invalid data for `is_shared_partner`. Must be a boolean:", `is_shared_partner`))
        }
        self$`is_shared_partner` <- `is_shared_partner`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserBusinessRoleBinding in JSON format
    toJSON = function() {
      UserBusinessRoleBindingObject <- list()
      if (!is.null(self$`assets_summary`)) {
        UserBusinessRoleBindingObject[["assets_summary"]] <-
          self$`assets_summary`$toJSON()
      }
      if (!is.null(self$`business_roles`)) {
        UserBusinessRoleBindingObject[["business_roles"]] <-
          self$`business_roles`
      }
      if (!is.null(self$`created_by_business`)) {
        UserBusinessRoleBindingObject[["created_by_business"]] <-
          self$`created_by_business`$toJSON()
      }
      if (!is.null(self$`created_by_user`)) {
        UserBusinessRoleBindingObject[["created_by_user"]] <-
          self$`created_by_user`$toJSON()
      }
      if (!is.null(self$`created_time`)) {
        UserBusinessRoleBindingObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`id`)) {
        UserBusinessRoleBindingObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`is_shared_partner`)) {
        UserBusinessRoleBindingObject[["is_shared_partner"]] <-
          self$`is_shared_partner`
      }
      if (!is.null(self$`user`)) {
        UserBusinessRoleBindingObject[["user"]] <-
          self$`user`$toJSON()
      }
      UserBusinessRoleBindingObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UserBusinessRoleBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserBusinessRoleBinding
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`assets_summary`)) {
        `assets_summary_object` <- BusinessMemberAssetsSummary$new()
        `assets_summary_object`$fromJSON(jsonlite::toJSON(this_object$`assets_summary`, auto_unbox = TRUE, digits = NA))
        self$`assets_summary` <- `assets_summary_object`
      }
      if (!is.null(this_object$`business_roles`)) {
        self$`business_roles` <- ApiClient$new()$deserializeObj(this_object$`business_roles`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`created_by_business`)) {
        `created_by_business_object` <- BusinessAccessUserSummary$new()
        `created_by_business_object`$fromJSON(jsonlite::toJSON(this_object$`created_by_business`, auto_unbox = TRUE, digits = NA))
        self$`created_by_business` <- `created_by_business_object`
      }
      if (!is.null(this_object$`created_by_user`)) {
        `created_by_user_object` <- BusinessAccessUserSummary$new()
        `created_by_user_object`$fromJSON(jsonlite::toJSON(this_object$`created_by_user`, auto_unbox = TRUE, digits = NA))
        self$`created_by_user` <- `created_by_user_object`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`is_shared_partner`)) {
        self$`is_shared_partner` <- this_object$`is_shared_partner`
      }
      if (!is.null(this_object$`user`)) {
        `user_object` <- BusinessAccessUserSummary$new()
        `user_object`$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
        self$`user` <- `user_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserBusinessRoleBinding in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`assets_summary`)) {
          sprintf(
          '"assets_summary":
          %s
          ',
          jsonlite::toJSON(self$`assets_summary`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`business_roles`)) {
          sprintf(
          '"business_roles":
             [%s]
          ',
          paste(unlist(lapply(self$`business_roles`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`created_by_business`)) {
          sprintf(
          '"created_by_business":
          %s
          ',
          jsonlite::toJSON(self$`created_by_business`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`created_by_user`)) {
          sprintf(
          '"created_by_user":
          %s
          ',
          jsonlite::toJSON(self$`created_by_user`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`is_shared_partner`)) {
          sprintf(
          '"is_shared_partner":
            %s
                    ',
          tolower(self$`is_shared_partner`)
          )
        },
        if (!is.null(self$`user`)) {
          sprintf(
          '"user":
          %s
          ',
          jsonlite::toJSON(self$`user`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UserBusinessRoleBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserBusinessRoleBinding
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`assets_summary` <- BusinessMemberAssetsSummary$new()$fromJSON(jsonlite::toJSON(this_object$`assets_summary`, auto_unbox = TRUE, digits = NA))
      self$`business_roles` <- ApiClient$new()$deserializeObj(this_object$`business_roles`, "array[character]", loadNamespace("openapi"))
      self$`created_by_business` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`created_by_business`, auto_unbox = TRUE, digits = NA))
      self$`created_by_user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`created_by_user`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`id` <- this_object$`id`
      self$`is_shared_partner` <- this_object$`is_shared_partner`
      self$`user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to UserBusinessRoleBinding and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UserBusinessRoleBinding
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# UserBusinessRoleBinding$unlock()
#
## Below is an example to define the print function
# UserBusinessRoleBinding$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserBusinessRoleBinding$lock()

