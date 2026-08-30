//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'network_type.g.dart';

class NetworkType extends EnumClass {

  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'wifi')
  static const NetworkType wifi = _$wifi;
  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'cellular_2g')
  static const NetworkType cellular2g = _$cellular2g;
  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'cellular_3g')
  static const NetworkType cellular3g = _$cellular3g;
  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'cellular_4g')
  static const NetworkType cellular4g = _$cellular4g;
  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'cellular_5g')
  static const NetworkType cellular5g = _$cellular5g;
  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'cellular_6g')
  static const NetworkType cellular6g = _$cellular6g;
  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'ethernet')
  static const NetworkType ethernet = _$ethernet;
  /// Type of network connection.
  @BuiltValueEnumConst(wireName: r'unknown')
  static const NetworkType unknown = _$unknown;

  static Serializer<NetworkType> get serializer => _$networkTypeSerializer;

  const NetworkType._(String name): super(name);

  static BuiltSet<NetworkType> get values => _$values;
  static NetworkType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NetworkTypeMixin = Object with _$NetworkTypeMixin;

