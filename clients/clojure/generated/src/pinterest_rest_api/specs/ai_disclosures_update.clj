(ns pinterest-rest-api.specs.ai-disclosures-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ai-disclosure-item :refer :all]
            )
  (:import (java.io File)))


(def ai-disclosures-update-data
  {
   (ds/opt :values) (s/coll-of ai-disclosure-item-spec)
   })

(def ai-disclosures-update-spec
  (ds/spec
    {:name ::ai-disclosures-update
     :spec ai-disclosures-update-data}))
