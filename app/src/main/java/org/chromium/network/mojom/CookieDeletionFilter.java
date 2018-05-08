
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class CookieDeletionFilter extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo.common.mojom.Time createdAfterTime;
    public org.chromium.mojo.common.mojom.Time createdBeforeTime;
    public String[] excludingDomains;
    public String[] includingDomains;
    public String cookieName;
    public org.chromium.url.mojom.Url url;
    public int sessionControl;

    private CookieDeletionFilter(int version) {
        super(STRUCT_SIZE, version);
        this.sessionControl = (int) CookieDeletionSessionControl.IGNORE_CONTROL;
    }

    public CookieDeletionFilter() {
        this(0);
    }

    public static CookieDeletionFilter deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CookieDeletionFilter deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CookieDeletionFilter decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CookieDeletionFilter result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new CookieDeletionFilter(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                result.createdAfterTime = org.chromium.mojo.common.mojom.Time.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                result.createdBeforeTime = org.chromium.mojo.common.mojom.Time.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                if (decoder1 == null) {
                    result.excludingDomains = null;
                } else {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.excludingDomains = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.excludingDomains[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                if (decoder1 == null) {
                    result.includingDomains = null;
                } else {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.includingDomains = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.includingDomains[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.cookieName = decoder0.readString(40, true);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.sessionControl = decoder0.readInt(56);
                    CookieDeletionSessionControl.validate(result.sessionControl);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.createdAfterTime, 8, true);
        
        encoder0.encode(this.createdBeforeTime, 16, true);
        
        if (this.excludingDomains == null) {
            encoder0.encodeNullPointer(24, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.excludingDomains.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.excludingDomains.length; ++i0) {
                
                encoder1.encode(this.excludingDomains[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.includingDomains == null) {
            encoder0.encodeNullPointer(32, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.includingDomains.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.includingDomains.length; ++i0) {
                
                encoder1.encode(this.includingDomains[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.cookieName, 40, true);
        
        encoder0.encode(this.url, 48, true);
        
        encoder0.encode(this.sessionControl, 56);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        CookieDeletionFilter other = (CookieDeletionFilter) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.createdAfterTime, other.createdAfterTime))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.createdBeforeTime, other.createdBeforeTime))
            return false;
        if (!java.util.Arrays.deepEquals(this.excludingDomains, other.excludingDomains))
            return false;
        if (!java.util.Arrays.deepEquals(this.includingDomains, other.includingDomains))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.cookieName, other.cookieName))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.url, other.url))
            return false;
        if (this.sessionControl!= other.sessionControl)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.createdAfterTime);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.createdBeforeTime);
        result = prime * result + java.util.Arrays.deepHashCode(this.excludingDomains);
        result = prime * result + java.util.Arrays.deepHashCode(this.includingDomains);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.cookieName);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.url);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.sessionControl);
        return result;
    }
}