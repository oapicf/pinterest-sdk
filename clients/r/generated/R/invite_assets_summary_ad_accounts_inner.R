#' Create a new InviteAssetsSummaryAdAccountsInner
#'
#' @description
#' InviteAssetsSummaryAdAccountsInner Class
#'
#' @docType class
#' @title InviteAssetsSummaryAdAccountsInner
#' @description InviteAssetsSummaryAdAccountsInner Class
#' @format An \code{R6Class} generator object
#' @field id Unique identifier of a business ad account. character [optional]
#' @field permissions Permission levels member or partner has on an asset. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteAssetsSummaryAdAccountsInner <- R6::R6Class(
  "InviteAssetsSummaryAdAccountsInner",
  public = list(
    `id` = NULL,
    `permissions` = NULL,

    #' @description
    #' Initialize a new InviteAssetsSummaryAdAccountsInner class.
    #'
    #' @param id Unique identifier of a business ad account.
    #' @param permissions Permission levels member or partner has on an asset.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `permissions` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(is.character(x)))
        self$`permissions` <- `permissions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return InviteAssetsSummaryAdAccountsInner in JSON format
    toJSON = function() {
      InviteAssetsSummaryAdAccountsInnerObject <- list()
      if (!is.null(self$`id`)) {
        InviteAssetsSummaryAdAccountsInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`permissions`)) {
        InviteAssetsSummaryAdAccountsInnerObject[["permissions"]] <-
          self$`permissions`
      }
      InviteAssetsSummaryAdAccountsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteAssetsSummaryAdAccountsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteAssetsSummaryAdAccountsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return InviteAssetsSummaryAdAccountsInner in JSON format
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
        if (!is.null(self$`permissions`)) {
          sprintf(
          '"permissions":
             [%s]
          ',
          paste(unlist(lapply(self$`permissions`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteAssetsSummaryAdAccountsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteAssetsSummaryAdAccountsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteAssetsSummaryAdAccountsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteAssetsSummaryAdAccountsInner
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
# InviteAssetsSummaryAdAccountsInner$unlock()
#
## Below is an example to define the print function
# InviteAssetsSummaryAdAccountsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteAssetsSummaryAdAccountsInner$lock()

