(ns pinterest-rest-api.specs.board-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-privacy :refer :all]
            )
  (:import (java.io File)))


(def board-create-data
  {
   (ds/opt :description) string?
   (ds/opt :is_ads_only) boolean?
   (ds/req :name) string?
   (ds/opt :privacy) board-privacy-spec
   })

(def board-create-spec
  (ds/spec
    {:name ::board-create
     :spec board-create-data}))
