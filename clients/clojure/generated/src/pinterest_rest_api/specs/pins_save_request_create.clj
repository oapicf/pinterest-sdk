(ns pinterest-rest-api.specs.pins-save-request-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pins-save-request-create-data
  {
   (ds/opt :board_id) string?
   (ds/opt :board_section_id) string?
   })

(def pins-save-request-create-spec
  (ds/spec
    {:name ::pins-save-request-create
     :spec pins-save-request-create-data}))
