#!/bin/bash
echo "Stopping any process on port 8080..."

# Check if fuser is installed, then run it
if command -v fuser >/dev/null 2>&1; then
    sudo fuser -k 8080/tcp || echo "No process found on port 8080."
else
    # Fallback to lsof if fuser isn't there
    sudo kill -9 $(sudo lsof -t -i:8080) || echo "No process found on port 8080."
fi

exit 0
