#' Create a new CreateInvitesResultsResponseArrayItemsInnerInvite
#'
#' @description
#' An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
#'
#' @docType class
#' @title CreateInvitesResultsResponseArrayItemsInnerInvite
#' @description CreateInvitesResultsResponseArrayItemsInnerInvite Class
#' @format An \code{R6Class} generator object
#' @field id Unique identifier of the invite/request. character [optional]
#' @field user Metadata for the member/partner that was sent the invite/request. \link{BusinessAccessUserSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateInvitesResultsResponseArrayItemsInnerInvite <- R6::R6Class(
  "CreateInvitesResultsResponseArrayItemsInnerInvite",
  public = list(
    `id` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new CreateInvitesResultsResponseArrayItemsInnerInvite class.
    #'
    #' @param id Unique identifier of the invite/request.
    #' @param user Metadata for the member/partner that was sent the invite/request.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `user` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateInvitesResultsResponseArrayItemsInnerInvite in JSON format
    toJSON = function() {
      CreateInvitesResultsResponseArrayItemsInnerInviteObject <- list()
      if (!is.null(self$`id`)) {
        CreateInvitesResultsResponseArrayItemsInnerInviteObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`user`)) {
        CreateInvitesResultsResponseArrayItemsInnerInviteObject[["user"]] <-
          self$`user`$toJSON()
      }
      CreateInvitesResultsResponseArrayItemsInnerInviteObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateInvitesResultsResponseArrayItemsInnerInvite
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateInvitesResultsResponseArrayItemsInnerInvite
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
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
    #' @return CreateInvitesResultsResponseArrayItemsInnerInvite in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
    #' Deserialize JSON string into an instance of CreateInvitesResultsResponseArrayItemsInnerInvite
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateInvitesResultsResponseArrayItemsInnerInvite
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateInvitesResultsResponseArrayItemsInnerInvite and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateInvitesResultsResponseArrayItemsInnerInvite
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
# CreateInvitesResultsResponseArrayItemsInnerInvite$unlock()
#
## Below is an example to define the print function
# CreateInvitesResultsResponseArrayItemsInnerInvite$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateInvitesResultsResponseArrayItemsInnerInvite$lock()

