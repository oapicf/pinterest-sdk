(ns pinterest-rest-api.specs.ai-disclosures
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ai-disclosure-item :refer :all]
            )
  (:import (java.io File)))


(def ai-disclosures-data
  {
   (ds/req :values) (s/coll-of ai-disclosure-item-spec)
   })

(def ai-disclosures-spec
  (ds/spec
    {:name ::ai-disclosures
     :spec ai-disclosures-data}))
