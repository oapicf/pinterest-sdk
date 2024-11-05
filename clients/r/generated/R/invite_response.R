#' Create a new InviteResponse
#'
#' @description
#' InviteResponse Class
#'
#' @docType class
#' @title InviteResponse
#' @description InviteResponse Class
#' @format An \code{R6Class} generator object
#' @field assets_summary  \link{InviteAssetsSummary} [optional]
#' @field business_roles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. list(character) [optional]
#' @field created_by_business Metadata for the business that created the invite/request. \link{BusinessAccessUserSummary} [optional]
#' @field created_by_user Metadata for the user that created the invite/request. \link{BusinessAccessUserSummary} [optional]
#' @field created_time The time the invite/request was created. Returned in milliseconds. integer [optional]
#' @field id Unique identifier of the invite/request. character [optional]
#' @field invite_data  \link{BaseInviteDataResponseInviteData} [optional]
#' @field is_received_invite Indicates whether the invite/request was received. character [optional]
#' @field user Metadata for the member/partner that was sent the invite/request. \link{BusinessAccessUserSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteResponse <- R6::R6Class(
  "InviteResponse",
  public = list(
    `assets_summary` = NULL,
    `business_roles` = NULL,
    `created_by_business` = NULL,
    `created_by_user` = NULL,
    `created_time` = NULL,
    `id` = NULL,
    `invite_data` = NULL,
    `is_received_invite` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new InviteResponse class.
    #'
    #' @param assets_summary assets_summary
    #' @param business_roles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
    #' @param created_by_business Metadata for the business that created the invite/request.
    #' @param created_by_user Metadata for the user that created the invite/request.
    #' @param created_time The time the invite/request was created. Returned in milliseconds.
    #' @param id Unique identifier of the invite/request.
    #' @param invite_data invite_data
    #' @param is_received_invite Indicates whether the invite/request was received.
    #' @param user Metadata for the member/partner that was sent the invite/request.
    #' @param ... Other optional arguments.
    initialize = function(`assets_summary` = NULL, `business_roles` = NULL, `created_by_business` = NULL, `created_by_user` = NULL, `created_time` = NULL, `id` = NULL, `invite_data` = NULL, `is_received_invite` = NULL, `user` = NULL, ...) {
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
      if (!is.null(`invite_data`)) {
        stopifnot(R6::is.R6(`invite_data`))
        self$`invite_data` <- `invite_data`
      }
      if (!is.null(`is_received_invite`)) {
        if (!(is.logical(`is_received_invite`) && length(`is_received_invite`) == 1)) {
          stop(paste("Error! Invalid data for `is_received_invite`. Must be a boolean:", `is_received_invite`))
        }
        self$`is_received_invite` <- `is_received_invite`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return InviteResponse in JSON format
    toJSON = function() {
      InviteResponseObject <- list()
      if (!is.null(self$`assets_summary`)) {
        InviteResponseObject[["assets_summary"]] <-
          self$`assets_summary`$toJSON()
      }
      if (!is.null(self$`business_roles`)) {
        InviteResponseObject[["business_roles"]] <-
          self$`business_roles`
      }
      if (!is.null(self$`created_by_business`)) {
        InviteResponseObject[["created_by_business"]] <-
          self$`created_by_business`$toJSON()
      }
      if (!is.null(self$`created_by_user`)) {
        InviteResponseObject[["created_by_user"]] <-
          self$`created_by_user`$toJSON()
      }
      if (!is.null(self$`created_time`)) {
        InviteResponseObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`id`)) {
        InviteResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`invite_data`)) {
        InviteResponseObject[["invite_data"]] <-
          self$`invite_data`$toJSON()
      }
      if (!is.null(self$`is_received_invite`)) {
        InviteResponseObject[["is_received_invite"]] <-
          self$`is_received_invite`
      }
      if (!is.null(self$`user`)) {
        InviteResponseObject[["user"]] <-
          self$`user`$toJSON()
      }
      InviteResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`assets_summary`)) {
        `assets_summary_object` <- InviteAssetsSummary$new()
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
      if (!is.null(this_object$`invite_data`)) {
        `invite_data_object` <- BaseInviteDataResponseInviteData$new()
        `invite_data_object`$fromJSON(jsonlite::toJSON(this_object$`invite_data`, auto_unbox = TRUE, digits = NA))
        self$`invite_data` <- `invite_data_object`
      }
      if (!is.null(this_object$`is_received_invite`)) {
        self$`is_received_invite` <- this_object$`is_received_invite`
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
    #' @return InviteResponse in JSON format
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
        if (!is.null(self$`invite_data`)) {
          sprintf(
          '"invite_data":
          %s
          ',
          jsonlite::toJSON(self$`invite_data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`is_received_invite`)) {
          sprintf(
          '"is_received_invite":
            %s
                    ',
          tolower(self$`is_received_invite`)
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
    #' Deserialize JSON string into an instance of InviteResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`assets_summary` <- InviteAssetsSummary$new()$fromJSON(jsonlite::toJSON(this_object$`assets_summary`, auto_unbox = TRUE, digits = NA))
      self$`business_roles` <- ApiClient$new()$deserializeObj(this_object$`business_roles`, "array[character]", loadNamespace("openapi"))
      self$`created_by_business` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`created_by_business`, auto_unbox = TRUE, digits = NA))
      self$`created_by_user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`created_by_user`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`id` <- this_object$`id`
      self$`invite_data` <- BaseInviteDataResponseInviteData$new()$fromJSON(jsonlite::toJSON(this_object$`invite_data`, auto_unbox = TRUE, digits = NA))
      self$`is_received_invite` <- this_object$`is_received_invite`
      self$`user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteResponse
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
# InviteResponse$unlock()
#
## Below is an example to define the print function
# InviteResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteResponse$lock()

