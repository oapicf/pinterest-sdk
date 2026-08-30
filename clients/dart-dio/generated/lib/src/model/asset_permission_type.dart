//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_permission_type.g.dart';

class AssetPermissionType extends EnumClass {

  /// Permission aggregation type for asset access
  @BuiltValueEnumConst(wireName: r'AGGREGATED_PERMISSION')
  static const AssetPermissionType AGGREGATED_PERMISSION = _$AGGREGATED_PERMISSION;
  /// Permission aggregation type for asset access
  @BuiltValueEnumConst(wireName: r'DIRECT_PERMISSION')
  static const AssetPermissionType DIRECT_PERMISSION = _$DIRECT_PERMISSION;

  static Serializer<AssetPermissionType> get serializer => _$assetPermissionTypeSerializer;

  const AssetPermissionType._(String name): super(name);

  static BuiltSet<AssetPermissionType> get values => _$values;
  static AssetPermissionType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AssetPermissionTypeMixin = Object with _$AssetPermissionTypeMixin;

