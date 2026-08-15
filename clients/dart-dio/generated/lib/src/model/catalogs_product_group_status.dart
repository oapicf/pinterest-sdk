//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_status.g.dart';

class CatalogsProductGroupStatus extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const CatalogsProductGroupStatus ACTIVE = _$ACTIVE;
  @BuiltValueEnumConst(wireName: r'INACTIVE')
  static const CatalogsProductGroupStatus INACTIVE = _$INACTIVE;

  static Serializer<CatalogsProductGroupStatus> get serializer => _$catalogsProductGroupStatusSerializer;

  const CatalogsProductGroupStatus._(String name): super(name);

  static BuiltSet<CatalogsProductGroupStatus> get values => _$values;
  static CatalogsProductGroupStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CatalogsProductGroupStatusMixin = Object with _$CatalogsProductGroupStatusMixin;

