(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    values: Enums.nonnullablecatalogscurrency;
    negated: bool;
} [@@deriving yojson { strict = false }, show ];;

let create (values : Enums.nonnullablecatalogscurrency) (negated : bool) : t = {
    values = values;
    negated = negated;
}
