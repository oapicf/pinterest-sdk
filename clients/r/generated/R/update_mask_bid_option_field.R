#' @docType class
#' @title UpdateMaskBidOptionField
#' @description UpdateMaskBidOptionField Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateMaskBidOptionField <- R6::R6Class(
  "UpdateMaskBidOptionField",
  public = list(

    #' @description
    #' Initialize a new UpdateMaskBidOptionField class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_UpdateMaskBidOptionField()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
        warning("Initializing UpdateMaskBidOptionField with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize UpdateMaskBidOptionField, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMaskBidOptionField in JSON format
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMaskBidOptionField
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of UpdateMaskBidOptionField
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMaskBidOptionField in JSON format
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMaskBidOptionField
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of UpdateMaskBidOptionField
    fromJSONString = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    }
  ),
  private = list(
    value = NULL
  )
)

# add to utils.R
.parse_UpdateMaskBidOptionField <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[BID, APP_TYPE_BID_MULTIPLIER_SET, PLACEMENT_BID_MULTIPLIER_SET]")
  unlist(strsplit(res, ", "))
}

