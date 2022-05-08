(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Media_upload_all_of_upload_parameters.t : The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 *)

type t = {
    x_amz_date: string option [@default None];
    x_amz_signature: string option [@default None];
    x_amz_security_token: string option [@default None];
    x_amz_algorithm: string option [@default None];
    key: string option [@default None];
    policy: string option [@default None];
    x_amz_credential: string option [@default None];
    content_type: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** The list of parameter key/value pairs you will need to send with your POST request to upload your media file. *)
let create () : t = {
    x_amz_date = None;
    x_amz_signature = None;
    x_amz_security_token = None;
    x_amz_algorithm = None;
    key = None;
    policy = None;
    x_amz_credential = None;
    content_type = None;
}
